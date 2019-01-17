package com.github.gustavosci.testrabbitspring.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class OrderQueueConsumer {

    @RabbitListener(queues = {"${queue.order.name}"})
    public void receive(@Payload final String order) {
        System.out.println("Recebendo mensagem na fila: " + order);
    }
}
