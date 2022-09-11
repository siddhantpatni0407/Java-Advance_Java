package com.sid.reactor.sec1;

import reactor.core.publisher.Mono;

/**
 * @author Siddhant Patni
 */
public class Lec02Mono {

    public static void main(String[] args) {

        Mono<Integer> mono = Mono.just(1);

        //System.out.println(mono);

        mono.subscribe(i -> System.out.println("Received : " + i));
    }
}
