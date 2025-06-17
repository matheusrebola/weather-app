package app.weather.climatics.config.rabbitmq;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    // Configuração para CONSUMIR mensagens vindas do serviço Local
    public static final String CONSUME_QUEUE = "clima.queue";

    // Configuração para PRODUZIR mensagens para o serviço Notificação
    public static final String PRODUCE_EXCHANGE = "clima.exchange";
    public static final String PRODUCE_ROUTING_KEY = "clima.route";

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

    // Fila que o serviço Clima vai CONSUMIR (recebe mensagens do Local)
    @Bean
    public Queue consumeQueue() {
        return new Queue(CONSUME_QUEUE, true);
    }

    // Exchange que o serviço Clima vai usar para PRODUZIR (envia para Notificação)
    @Bean
    public DirectExchange produceExchange() {
        return new DirectExchange(PRODUCE_EXCHANGE);
    }
}