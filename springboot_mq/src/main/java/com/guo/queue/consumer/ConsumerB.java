package com.guo.queue.consumer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;

@ComponentScan
public class ConsumerB {

    /**
     * 使用JmsListener配置消费者监听的队列
     *
     * @param message 接收到的消息
     */
    @JmsListener(destination = "yzshi_queue")
    @SendTo("out.queue")
    public String receiveQueue(String message){
        System.out.println("----------------Consumer-B : 收到的报文为:" + message);
        return message;
    }

    @JmsListener(destination = "yzshi_queue")
    public void printReceiveQueue(String message) {
        System.out.println("+++++++++++++++++Consumer-B : 收到的报文为:" + message);
    }
}
