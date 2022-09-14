package com.sid.reactor.sec4;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Flux;

/**
 * @author Siddhant Patni
 */
public class Lec08DefaultIfEmpty {

    public static void main(String[] args) {

        getOrderNumbers()
                .filter(i -> i > 10)
                .defaultIfEmpty(-100)
                .subscribe(Util.subscriber());
    }

    private static Flux<Integer> getOrderNumbers() {
        //return Flux.range(1, 10);
        return Flux.range(1, 12);
    }
}
