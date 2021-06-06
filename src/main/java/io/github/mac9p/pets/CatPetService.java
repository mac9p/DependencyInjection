package io.github.mac9p.pets;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;

public class CatPetService implements PetService {

    public String getPet(){
        return "i am cat";
    }
}
