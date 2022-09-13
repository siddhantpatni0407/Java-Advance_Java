package com.sid.reactor.sec3.helper;

import com.sid.reactor.util.Util;
import reactor.core.publisher.FluxSink;

import java.util.function.Consumer;

/**
 * @author Siddhant Patni
 */
public class NameProducer implements Consumer<FluxSink<String>> {

    private FluxSink<String> fluxSink;

    @Override
    public void accept(FluxSink<String> stringFluxSink) {
        this.fluxSink = stringFluxSink;
    }

    public void produce() {
        String name = Util.faker().name().fullName();
        String thread = Thread.currentThread().getName();
        this.fluxSink.next(thread + " : " + name);
    }


}