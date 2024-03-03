package com.esisba.gateway.controller;

import com.esisba.gateway.DTO.FormationDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DefaultAPI {

    @GetMapping("/defaultFormations")
    public List<FormationDTO> getDefaultFormations() {
        List<FormationDTO> l = new ArrayList<>();
        
        return l;
    }
}
