package com.sid.reactor.sec1;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Mono;

/**
 * @author Siddhant Patni
 */
public class Lec03MonoSubscribe {

    public static void main(String[] args) {

        //publisher
        Mono<Integer> mono1 = Mono.just("ball")
                .map(String::length)
                .map(l -> l / 0);

        Mono<Integer> mono2 = Mono.just("apple")
                .map(String::length)
                .map(l -> l / 2);

        //1
        //mono.subscriber();

        //2
        /*
        mono1.subscribe(
                item -> System.out.println(item),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("Completed")
        );

        mono2.subscribe(
                item -> System.out.println(item),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("Completed")
        );
         */

        //After adding Util class

        mono1.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );

        mono2.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );
    }
}