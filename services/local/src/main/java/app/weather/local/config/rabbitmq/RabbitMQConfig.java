package app.weather.local.config.rabbitmq;


import org.springframework.amqp.core.*;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

@Configuration
public class RabbitMQConfig {

    public static final String EXCHANGE = "local.exchange";
    public static final String ROUTING_KEY = "local.route";
    public static final String QUEUE = "local.queue";

    @Bean
    public Jackson2JsonMessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory,
                                         Jackson2JsonMessageConverter messageConverter) {
        RabbitTemplate template = new RabbitTemplate(connectionFactory);
        template.setMessageConverter(messageConverter);
        return template;
    }

    @Bean
    public Declarables bindings() {
        return new Declarables(
                new Queue(QUEUE, true),
                new DirectExchange(EXCHANGE),
                BindingBuilder.bind(new Queue(QUEUE)).to(new DirectExchange(EXCHANGE)).with(ROUTING_KEY)
        );
    }
}
