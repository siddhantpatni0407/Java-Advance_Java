package com.sid.reactor.sec03;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Flux;

/**
 * @author Siddhant Patni
 */
public class Lec01FluxCreate {

    public static void main(String[] args) {
        Flux.create(fluxSink -> {

                   /*
                    fluxSink.next(1);
                    fluxSink.next(2);
                    fluxSink.complete();
                    */

                    String country;
                    do {
                        country = Util.faker().country().name();
                        fluxSink.next(country);
                    } while (!country.toLowerCase().equals("india"));
                    fluxSink.complete();

                   /* for (int i = 0; i < 10; i++) {
                        fluxSink.next(Util.faker().country().name());
                    }
                    fluxSink.complete();*/
                })
                .subscribe(Util.subscriber());
    }
}