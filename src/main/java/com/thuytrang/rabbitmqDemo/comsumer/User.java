package com.thuytrang.rabbitmqDemo.comsumer;

import com.thuytrang.rabbitmqDemo.config.MessagingConfig;
import com.thuytrang.rabbitmqDemo.dto.OrderStatus;

import org.springframework.amqp.rabbit.annotation.RabbitListener;




import org.springframework.stereotype.Component;



@Component

public class User {

        @RabbitListener(queues = MessagingConfig.QUEUE)
        public void consumeMessageFromQueue (OrderStatus orderStatus){
            System.out.println("Message received from queue : " + orderStatus);
        }

}

