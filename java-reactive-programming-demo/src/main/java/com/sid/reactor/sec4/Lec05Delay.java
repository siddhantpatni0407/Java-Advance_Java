package com.sid.reactor.sec4;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Flux;
import reactor.util.concurrent.Queues;

import java.time.Duration;

/**
 * @author Siddhant Patni
 */
public class Lec05Delay {

    public static void main(String[] args) {

        //Refer Queues (reactor.util.concurrent.Queues) class reactor library for below property,
        // by default it's value is 32, min value is 8
        System.setProperty("reactor.bufferSize.x", "9"); // value should be >=8

        Flux.range(1, 100)   //32
                .log()
                .delayElements(Duration.ofSeconds(1))
                .subscribe(Util.subscriber());

        Util.sleepSeconds(60);
    }
}