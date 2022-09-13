package com.sid.reactor.sec3;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Flux;

/**
 * @author Siddhant Patni
 */
public class Lec06FluxGenerateAssignment {

    public static void main(String[] args) {

        // india
        // max = 10
        // during the process subscriber cancels -then  exit

        Flux.generate(synchronousSink -> {
                    String country = Util.faker().country().name();
                    System.out.println("emitting " + country);
                    synchronousSink.next(country);
                    if (country.toLowerCase().equals("india"))
                        synchronousSink.complete();
                })
                .subscribe(Util.subscriber());
    }
}