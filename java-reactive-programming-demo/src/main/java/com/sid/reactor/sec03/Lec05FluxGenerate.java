package com.sid.reactor.sec03;

import com.sid.reactor.util.Util;
import lombok.val;
import reactor.core.publisher.Flux;

/**
 * @author Siddhant Patni
 */
public class Lec05FluxGenerate {

    public static void main(String[] args) {

        Flux.generate(synchronousSink -> {
                    System.out.println("emitting");
                    synchronousSink.next(Util.faker().country().name()); // allow to emit only one item
                    // synchronousSink.next(Util.faker().country().name());
                    // synchronousSink.error(new RuntimeException("oops error"));
                    synchronousSink.complete(); // if we invoke complete() then take() will not be under consideration
                })
                .take(2)
                .subscribe(Util.subscriber());
    }
}