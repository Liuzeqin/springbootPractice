package com.example.messagingredis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;



public class Receiver {

    private static final Logger logger = LoggerFactory.getLogger(Receiver.class);
    private AtomicInteger counter = new AtomicInteger();

    public void receiveMsg(String msg){
        logger.info("Receive <" + msg + ">");
        counter.incrementAndGet();
    }

    public int getCount() {
        return counter.get();
    }

}
