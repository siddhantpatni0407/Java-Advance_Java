package com.sid.reactor.sec03;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Flux;

/**
 * @author Siddhant Patni
 */
public class Lec07FluxGenerateCounter {

    public static void main(String[] args) {

        Flux.generate(() -> 1,
                        (counter, sink) -> {
                            String country = Util.faker().country().name();
                            sink.next(country);
                            if (counter >= 10 || country.toLowerCase().equals("india"))
                                sink.complete();
                            return counter + 1;
                        }
                )
                .take(4)
                .subscribe(Util.subscriber());
    }
}