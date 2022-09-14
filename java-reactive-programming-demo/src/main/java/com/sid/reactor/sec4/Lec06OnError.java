package com.sid.reactor.sec4;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Siddhant Patni
 */
public class Lec06OnError {

    public static void main(String[] args) {

        Flux.range(1, 10)
                .log()
                .map(i -> 10 / (5 - i))
                // .onErrorReturn(-1)
                //  .onErrorResume(e -> fallback())
                .onErrorContinue((err, obj) -> {

                })
                .subscribe(Util.subscriber());
    }

    private static Mono<Integer> fallback() {
        return Mono.fromSupplier(() -> Util.faker().random().nextInt(100, 200));
    }
}