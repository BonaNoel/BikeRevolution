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
        partsRepository.save(new Parts(3L,"Gumijavító készlet (belső)", 30,5));
        partsRepository.save(new Parts(4L,"Lánc", 50,10));
        partsRepository.save(new Parts(5L,"Fékpofa",40 ,8));
        partsRepository.save(new Parts(6L,"Kormány markolat",50 ,5));
        partsRepository.save(new Parts(7L,"Féktárcsa",25 ,30));
        partsRepository.save(new Parts(8L,"Váltó",20 ,20));
        partsRepository.save(new Parts(9L,"Kormányfej",18 ,25));
        partsRepository.save(new Parts(10L,"Pedál",30 ,5));
        partsRepository.save(new Parts(11L,"Kormány villa",20 ,20));
        partsRepository.save(new Parts(12L,"Első kerékpár agy",20,15));
        partsRepository.save(new Parts(13L,"Hátsó kerépkár agy", 20,15));
        partsRepository.save(new Parts(14L,"Nyereg",15 ,10));
        partsRepository.save(new Parts(15L,"Fék bowden",30 ,5));
        partsRepository.save(new Parts(16L,"Féktest",40,10));
        partsRepository.save(new Parts(17L,"Láncolaj",20,5));
        partsRepository.save(new Parts(18L,"Kenőzsír",10,5));
        partsRepository.save(new Parts(19L,"Gumijavító készlet (külső)",15,8));
        partsRepository.save(new Parts(20L,"Váltóbowden",25,5));


        repairsRepository.save(new Repairs(101L,"Defekt Javítás Cserével","Belső gumicsere ","33"));
        repairsRepository.save(new Repairs(102L,"Defekt Javítás Ragasztással","Belső gumi javítása","15"));
        repairsRepository.save(new Repairs(103L,"Lánc Csere","Új lánc felszerelése/Olajozása","40"));
        repairsRepository.save(new Repairs(104L,"Fékbetét Csere/Új fékbowden beállítása","Fékalkatrészek beállítása vagy cseréje","38"));
        repairsRepository.save(new Repairs(105L,"Váltóállítás","Váltókábel beállítása vagy cseréje","28"));
        repairsRepository.save(new Repairs(106L,"Kerék Centrálás","Küllők beállítása és kiegyensúlyozás","30"));
        repairsRepository.save(new Repairs(107L,"Féktárcsa Csere","Féktárcsa cseréje és beállítása","78"));
        repairsRepository.save(new Repairs(108L,"Kormányfej Cseréje","Kormányfej cseréje és beállítása/Zsírozása","65"));
        repairsRepository.save(new Repairs(109L,"Pedál Cseréje","Pedál cseréje és beállítása/Zsírozása","30"));
        repairsRepository.save(new Repairs(110L,"Kormány és Kormányszár Állítás","Kormány és kormányszár beállítása","25"));
        repairsRepository.save(new Repairs(111L,"Nyereg Cseréje","Nyereg cseréje és beállítása/Zsírzás","25"));
        repairsRepository.save(new Repairs(112L,"Gumi Csere","Első hátsó külső gumi csere","30"));

        System.out.println("Database uploaded successfully");
    }
}
