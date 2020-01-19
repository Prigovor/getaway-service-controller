package com.prigovor.controller.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class IndexEndpoint {

    @GetMapping
    public Mono<String> greeting() {
        return Mono.just("Hello");
    }

}
