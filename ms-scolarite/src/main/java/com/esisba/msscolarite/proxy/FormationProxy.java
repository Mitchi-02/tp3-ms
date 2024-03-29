package com.esisba.msscolarite.proxy;


import com.esisba.msscolarite.model.Formation;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ms-formation")
@LoadBalancerClient(name="ms-formation")
public interface FormationProxy {

    @GetMapping("/formations/{id}")
    @CircuitBreaker(name = "fallback1", fallbackMethod = "fallbackFormation")
    public Formation getFormation(@PathVariable("id") Long idf);

    default Formation fallbackFormation(Throwable th){
        return new Formation(1L, "default", 20);
    }
}
