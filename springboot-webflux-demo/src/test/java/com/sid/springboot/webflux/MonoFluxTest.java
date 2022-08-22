package com.sid.springboot.webflux;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

    //to get onComplete() event
    @Test
    public void testMono1(){
        Mono<String> monoString = Mono.just("monostring").log();
        monoString.subscribe(System.out::println);
    }

    //to get onError() event
    @Test
    public void testMono2(){
        Mono<?> monoString = Mono.just("monostring")
                .then(Mono.error(new RuntimeException("Exception occurred in Mono")))
                .log();
        //monoString.subscribe(System.out::println);
        monoString.subscribe(System.out::println, (e)->System.out.println(e.getMessage()));
    }

    @Test
    public void testFlux1(){
        Flux<String> fluxString = Flux.just("Spring", "Spring Boot", "Hibernate", "Microservice")
                .concatWithValues("Kafka")
                .log();
        fluxString.subscribe(System.out::println);
    }

    @Test
    public void testFlux2(){
        Flux<String> fluxString = Flux.just("Spring", "Spring Boot", "Hibernate", "Microservice")
                .concatWithValues("Kafka")
                .concatWith(Flux.error(new RuntimeException("Exception occurred in Flux")))
                .log();
        fluxString.subscribe(System.out::println, (e)->System.out.println(e.getMessage()));
    }

    @Test
    public void testFlux3(){
        Flux<String> fluxString = Flux.just("Spring", "Spring Boot", "Hibernate", "Microservice")
                .concatWithValues("Kafka")
                .concatWith(Flux.error(new RuntimeException("Exception occurred in Flux")))
                .concatWithValues("AWS")
                .log();
        fluxString.subscribe(System.out::println, (e)->System.out.println(e.getMessage()));
    }
}