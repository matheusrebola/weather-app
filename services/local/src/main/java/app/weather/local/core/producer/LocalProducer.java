package app.weather.local.core.producer;

import app.weather.local.core.document.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import app.weather.local.config.rabbitmq.RabbitMQConfig;

@Component
@Slf4j
@RequiredArgsConstructor
public class LocalProducer {
    private final RabbitTemplate rabbitTemplate;

    public void enviarUsuario(Usuario usuario) {
        rabbitTemplate.convertAndSend(
                RabbitMQConfig.PRODUCE_EXCHANGE,
                RabbitMQConfig.PRODUCE_ROUTING_KEY,
                usuario
        );
    }
}
