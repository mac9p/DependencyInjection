package io.github.mac9p.dependencyinjection.controllers;

import io.github.mac9p.pets.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
    private final PetService petService;

    public PetController(@Qualifier("petService") PetService petService) {
        this.petService = petService;
    }

    public String getPet(){
        return petService.getPet();
    }
}
