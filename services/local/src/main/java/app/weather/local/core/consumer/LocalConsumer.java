package app.weather.local.core.consumer;

import app.weather.local.core.document.Usuario;
import app.weather.local.core.document.enums.EAnalise;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import app.weather.local.config.rabbitmq.RabbitMQConfig;

@Component
@RequiredArgsConstructor
@Slf4j
public class LocalConsumer {

    @RabbitListener(queues = RabbitMQConfig.CONSUME_QUEUE)
    public boolean verificarPostagem(Usuario usuario){
        EAnalise analise = usuario.getAnalise();
        return analise.equals(EAnalise.ANALISADO);
    }
}
