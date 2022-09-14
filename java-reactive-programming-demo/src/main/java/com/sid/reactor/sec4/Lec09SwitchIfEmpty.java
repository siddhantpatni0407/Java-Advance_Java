package com.sid.reactor.sec4;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Flux;

/**
 * @author Siddhant Patni
 */
public class Lec09SwitchIfEmpty {

    public static void main(String[] args) {

        getOrderNumbers()
                .filter(i -> i > 10)
                .switchIfEmpty(fallback())
                .subscribe(Util.subscriber());
    }

    private static Flux<Integer> getOrderNumbers() {
        //return Flux.range(1, 10);
        return Flux.range(1, 11);
    }

    private static Flux<Integer> fallback() {
        return Flux.range(20, 5);
    }
}
