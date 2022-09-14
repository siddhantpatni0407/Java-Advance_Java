package com.sid.reactor.sec4;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Flux;

/**
 * @author Siddhant Patni
 */
public class Lec02HandleAssignment {

    public static void main(String[] args) {

        Flux.generate(synchronousSink -> synchronousSink.next(Util.faker().country().name()))
                .map(Object::toString)
                .handle((s, synchronousSink) -> {
                    synchronousSink.next(s);
                    if (s.toLowerCase().equals("india"))
                        synchronousSink.complete();
                })
                .subscribe(Util.subscriber());
    }
}
