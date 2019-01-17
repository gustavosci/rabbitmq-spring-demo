RabbitMQ com Spring Boot -  Demo

>> Project for testing the use of RabbitMQ on Spring Boot Application.

**Steps:**
1. Download RabbitMQ image on Docker with following command:
``docker run -d --hostname my-rabbit --name rabbitmq -p 15672:15672 -p 5672:5672 -p 25676:25676 rabbitmq:3-management``

2. Access http://localhost:15672/#/queues and to click on "Add a new queue". Add a queue with name "OrderQueue"

3. Create Spring Boot Project on https://start.spring.io/, inserting RabbitMQ dependency

4. Configure RabbitMQ properties on application.yml

5. Create a RabbitConfiguration, focusing on defining a bean for queue

6. Create a sender

7. Create a listener (consumer)
