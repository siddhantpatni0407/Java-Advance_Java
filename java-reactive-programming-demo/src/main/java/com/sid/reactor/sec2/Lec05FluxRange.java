package com.sid.reactor.sec2;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Flux;

public class Lec05FluxRange {

    public static void main(String[] args) {

        // It will emits / prints integer numbers till 10 starting with 1
        Flux.range(1, 10)
                .subscribe(Util.onNext());

        // It will emits / prints 10 full names
        Flux.range(1, 10)
                .log() // prints logs
                .map(i -> Util.faker().name().fullName())
                .log()
                .subscribe(Util.onNext());
    }
}
