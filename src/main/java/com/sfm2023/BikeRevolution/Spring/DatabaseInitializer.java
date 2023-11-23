package com.sfm2023.BikeRevolution.Spring;

import com.sfm2023.BikeRevolution.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    @Autowired
    PartsRepository partsRepository;

    @Autowired
    RepairsRepository repairsRepository;

    @Autowired
    CustomersRepository customersRepository;

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

        repairsRepository.save(new Repairs(1L,"Defekt Javítás Cserével","Belső gumicsere ","33"));
        repairsRepository.save(new Repairs(2L,"Defekt Javítás Ragasztással","Belső gumi javítása","15"));
        repairsRepository.save(new Repairs(3L,"Lánc Csere","Új lánc felszerelése/Olajozása","40"));
        repairsRepository.save(new Repairs(4L,"Fékbetét Csere/Új fékbowden beállítása","Fékalkatrészek beállítása vagy cseréje","38"));
        repairsRepository.save(new Repairs(5L,"Váltóállítás","Váltókábel beállítása vagy cseréje","28"));
        repairsRepository.save(new Repairs(6L,"Kerék Centrálás","Küllők beállítása és kiegyensúlyozás","30"));
        repairsRepository.save(new Repairs(7L,"Féktárcsa Csere","Féktárcsa cseréje és beállítása","78"));
        repairsRepository.save(new Repairs(8L,"Kormányfej Cseréje","Kormányfej cseréje és beállítása/Zsírozása","65"));
        repairsRepository.save(new Repairs(9L,"Pedál Cseréje","Pedál cseréje és beállítása/Zsírozása","30"));
        repairsRepository.save(new Repairs(10L,"Kormány és Kormányszár Állítás","Kormány és kormányszár beállítása","25"));
        repairsRepository.save(new Repairs(11L,"Nyereg Cseréje","Nyereg cseréje és beállítása/Zsírozás","25"));
        repairsRepository.save(new Repairs(12L,"Gumi Csere","Első hátsó külső gumi csere","30"));

        customersRepository.save(new Customers(1L,"Bela","+36-30-522-6641","2023.51.12","faszaszadba"));

        System.out.println("Database uploaded successfully");
//        System.out.println(partsRepository.findById(2L));
    }
}
