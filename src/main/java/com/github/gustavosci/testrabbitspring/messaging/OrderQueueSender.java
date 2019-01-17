package com.github.gustavosci.testrabbitspring.messaging;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderQueueSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(final String order) {
        System.out.println("Enviando mensagem para a fila: " + order);
        rabbitTemplate.convertAndSend(queue.getName(), order);
    }
}
