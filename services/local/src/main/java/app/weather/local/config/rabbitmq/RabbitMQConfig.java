package app.weather.local.config.rabbitmq;


import org.springframework.amqp.core.*;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

@Configuration
public class RabbitMQConfig {
    // Configuração para CONSUMIR mensagens vindas do serviço Notificação
    public static final String CONSUME_QUEUE = "local.queue";

    // Configuração para PRODUZIR mensagens para o serviço Clima
    public static final String PRODUCE_EXCHANGE = "local.exchange";
    public static final String PRODUCE_ROUTING_KEY = "local.route";

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

    // Fila que o serviço Local vai CONSUMIR (recebe mensagens do Notificação)
    @Bean
    public Queue consumeQueue() {
        return new Queue(CONSUME_QUEUE, true);
    }

    // Exchange que o serviço Local vai usar para PRODUZIR (envia para Clima)
    @Bean
    public DirectExchange produceExchange() {
        return new DirectExchange(PRODUCE_EXCHANGE);
    }
}
