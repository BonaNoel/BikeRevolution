package com.sfm2023.BikeRevolution.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class databaseInitializer implements CommandLineRunner {

    @Autowired
    PartsRepository partsRepository;

    @Autowired
    RepairsRepository repairsRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Uploading to Database.....");


        partsRepository.save(new Parts(1L,"Belső gumi", 50,10));
        partsRepository.save(new Parts(2L,"Külső gumi", 50,10));
        partsRepository.save(new Parts(3L,"Ragasztószett", 30,5));
        partsRepository.save(new Parts(4L,"Lánc", 50,10));
        partsRepository.save(new Parts(5L,"Fékbetét",40 ,8));
        partsRepository.save(new Parts(6L,"Kormány markolat",50 ,5));
        partsRepository.save(new Parts(7L,"Hajtómű",25 ,30));
        partsRepository.save(new Parts(8L,"Váltó",20 ,20));
        partsRepository.save(new Parts(9L,"Kormányfej",18 ,25));
        partsRepository.save(new Parts(10L,"Pedál",30 ,5));
        partsRepository.save(new Parts(11L,"Kormány villa",20 ,20));
        partsRepository.save(new Parts(12L,"", ,));
        partsRepository.save(new Parts(13L,"", ,));
        partsRepository.save(new Parts(14L,"Nyereg",15 ,10));
        partsRepository.save(new Parts(15L,"Fék bovden",30 ,5));


        repairsRepository.save(new Repairs(101L,"Defekt Javítás Cserével","Belső gumicsere ",25));

        System.out.println("Database uploaded successfully");
    }
}
