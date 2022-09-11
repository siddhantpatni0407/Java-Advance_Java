package com.sid.reactor.sec2;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Flux;

/**
 * @author Siddhant Patni
 */
public class Lec09FluxFromMono {

    public static void main(String[] args) {

        // Mono<String> mono = Mono.just("a");

        // Flux<String> flux = Flux.from(mono);

        // flux.subscribe(Util.onNext());

        Flux.range(1, 10)
                .filter(i -> i > 3)
                .next()
                //.filter(i -> i > 3)
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());
    }

    public static void doSomething(Flux<String> flux) {

    }
}
