package com.sid.reactor.sec3;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Flux;

/**
 * @author Siddhant Patni
 */
public class Lec04FluxCreateIssueFix {

    public static void main(String[] args) {

        // only one instance of fluxsink
        Flux.create(fluxSink -> {
                    String country;
                    int counter = 0;
                    do {
                        country = Util.faker().country().name();
                        System.out.println("emitting : " + country);
                        fluxSink.next(country);
                        counter++;
                    } while (!country.toLowerCase().equals("canada") && !fluxSink.isCancelled() && counter < 10);
                    fluxSink.complete();
                })
                .take(3)
                .subscribe(Util.subscriber());

    }
}