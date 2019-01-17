package com.github.gustavosci.testrabbitspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.gustavosci.testrabbitspring.messaging.OrderQueueSender;

@SpringBootApplication
public class TestRabbitSpringApplication implements CommandLineRunner {

    @Autowired
    private OrderQueueSender sender;

    public static void main(String[] args) {
        SpringApplication.run(TestRabbitSpringApplication.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {
        System.out.println("Enviando mensagem para a fila");
        sender.send("teste");
    }
}

