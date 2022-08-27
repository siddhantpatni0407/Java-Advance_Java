package com.sid.reactor.sec1;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

public class Lec06SupplierRefactoring {

    public static void main(String[] args) {

        getName();
        getName()
                .subscribeOn(Schedulers.boundedElastic())
                .subscribe(Util.onNext());

        //blocking is used for testing purpose but we should not use it while building the application
        /*
        String name = getName()
                .subscribeOn(Schedulers.boundedElastic())
                .block();
        System.out.println(name);
        */
        getName();

        //blocking main thread in order to complete the execution of execute second getName() method
        Util.sleepSeconds(4);
    }

    public static Mono<String> getName() {
        System.out.println("entered getName() method");
        return Mono.fromSupplier(() -> {
            System.out.println("Generating name..");
            Util.sleepSeconds(3);
            return Util.faker().name().fullName();
        }).map(String::toUpperCase);
    }
}