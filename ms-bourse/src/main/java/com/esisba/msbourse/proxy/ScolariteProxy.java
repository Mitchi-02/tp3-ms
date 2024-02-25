package com.esisba.msbourse.proxy;

import com.esisba.msbourse.model.EtudiantScolarite;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ms-scolarite")
@LoadBalancerClient(name = "ms-scolarite")
public interface ScolariteProxy {

    @GetMapping("/etudiants/{id}")
    EtudiantScolarite getEtudiantScolarite(@PathVariable("id") Long id,
                                           @RequestParam("projection") String projection);
}
