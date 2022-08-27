package com.sid.reactor.sec1;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Mono;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class Lec05MonoFromSupplier {

    public static void main(String[] args) {

        //use only when you have data already
        //Mono<String> mono = Mono.just(getName());

        Supplier<String> stringSupplier = () -> getName();

        Mono<String> mono = Mono.fromSupplier(() -> getName());

        mono.subscribe(
                Util.onNext()
        );

        Callable<String> stringCallable = () -> getName();

        Mono.fromCallable(stringCallable)
                .subscribe(
                        Util.onNext()
                );
    }

    public static String getName() {
        System.out.println("Generating name..");
        return Util.faker().name().fullName();
    }
}
