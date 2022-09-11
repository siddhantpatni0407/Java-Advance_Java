package com.sid.reactor.sec2;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Flux;

/**
 * @author Siddhant Patni
 */
public class Lec01FluxIntro {

    public static void main(String[] args) {

        Flux<Integer> flux1 = Flux.just(1, 2, 3, 4);
        flux1.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete());

        Flux<Object> flux2 = Flux.just(1, 2, 3, 4, "a", Util.faker().name().fullName());
        flux2.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete());
    }
}
