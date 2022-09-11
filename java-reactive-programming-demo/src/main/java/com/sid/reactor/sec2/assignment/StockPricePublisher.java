package com.sid.reactor.sec2.assignment;

import com.github.javafaker.Faker;
import com.sid.reactor.util.Util;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Siddhant Patni
 */
public class StockPricePublisher {

    public static Flux<Integer> getPrice() {

        AtomicInteger atomicInteger = new AtomicInteger(100);
        return Flux.interval(Duration.ofSeconds(1))
                .map(i -> atomicInteger.getAndAccumulate(
                        Util.faker().random().nextInt(-5, 5),
                        Integer::sum
                ));
    }
}
