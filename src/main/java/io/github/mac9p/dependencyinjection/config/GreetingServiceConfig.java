package io.github.mac9p.dependencyinjection.config;

import io.github.mac9p.dependencyinjection.repositories.EnglishGreetingRepo;
import io.github.mac9p.dependencyinjection.repositories.EnglishGreetingRepoImpl;
import io.github.mac9p.dependencyinjection.services.*;
import io.github.mac9p.pets.CatPetService;
import io.github.mac9p.pets.DogPetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Profile({"EN", "default"})
    @Bean
    I18nEnglishGreetingService i18nService(){
        return new I18nEnglishGreetingService();
    }

    @Profile("ES")
    @Bean("i18nService")
    I18nSpanishGreetingService i18nSpanishGreetingService(){
        return new I18nSpanishGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }
    @Bean
    PropertyGreetingService propertyGreetingService(){
        return new PropertyGreetingService();
    }
    @Bean
    SetterGreetingService setterGreetingService(){
        return new SetterGreetingService();
    }

    @Bean
    DogPetService petService(){
        return new DogPetService();
    }
    @Bean("petService")
    CatPetService catPetService(){
        return new CatPetService();
    }
}
