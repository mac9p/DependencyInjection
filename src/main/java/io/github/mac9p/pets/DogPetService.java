package io.github.mac9p.pets;

public class DogPetService implements PetService{
    @Override
    public String getPet() {
        return "im a dog";
    }
}
