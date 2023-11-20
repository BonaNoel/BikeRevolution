package com.sfm2023.BikeRevolution.JavaFx;

import com.sfm2023.BikeRevolution.Spring.Parts;
import com.sfm2023.BikeRevolution.Spring.PartsRepository;
import com.sfm2023.BikeRevolution.Spring.RepairsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.sfm2023.BikeRevolution.Spring.*;
import java.util.ArrayList;


public class Modell {

    @Autowired
    static PartsRepository partsRepository;

    @Autowired
    static RepairsRepository repairsRepository;


    public static void listViewWrite() {
        ArrayList<Parts> dataList = (ArrayList<Parts>) partsRepository.findAll();
        System.out.println(dataList);
    }

}
