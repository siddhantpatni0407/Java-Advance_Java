package com.sid.springboot.webflux.router;

import com.sid.springboot.webflux.handler.CustomerHandler;
import com.sid.springboot.webflux.handler.CustomerStreamHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterConfig {

    @Autowired
    private CustomerHandler handler;

    @Autowired
    private CustomerStreamHandler streamHandler;

    @Bean
    public RouterFunction<ServerResponse> routerFunction() {
        return RouterFunctions.route()
                .GET("/router/customer", handler::loadCustomers)
                .GET("/router/customer/stream", streamHandler::getCustomers)
                .GET("/router/customer/{input}", handler::findCustomers)
                .POST("/router/customer/save", handler::saveCustomers )
                .build();
    }
}