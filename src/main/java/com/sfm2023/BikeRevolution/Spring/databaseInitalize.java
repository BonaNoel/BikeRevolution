package com.sfm2023.BikeRevolution.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class databaseInitalize implements CommandLineRunner {

    @Autowired
    PartsRepository partsRepository;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Database loading.....");


//        kitoltes megfeleloen majd tesztelesre
//        db kitalalasa mert nem tul jo

        partsRepository.save(new Parts(1L,"Belső gumi", 50,10));
        partsRepository.save(new Parts(2L,"Külső gumi", 50,10));
        partsRepository.save(new Parts(3L,"Belső gumi", 50,10));
        partsRepository.save(new Parts(4L,"Belső gumi", 50,10));
        partsRepository.save(new Parts(5L,"Belső gumi", 50,10));
        partsRepository.save(new Parts(6L,"Belső gumi", 50,10));
        partsRepository.save(new Parts(7L,"Belső gumi", 50,10));
        partsRepository.save(new Parts(8L,"Belső gumi", 50,10));
        partsRepository.save(new Parts(9L,"Belső gumi", 50,10));
        partsRepository.save(new Parts(10L,"Belső gumi", 50,10));
        partsRepository.save(new Parts(11L,"Belső gumi", 50,10));
        partsRepository.save(new Parts(12L,"Belső gumi", 50,10));
        partsRepository.save(new Parts(13L,"Belső gumi", 50,10));

    }
}
