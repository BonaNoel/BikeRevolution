package com.sfm2023.BikeRevolution.Controllers;

import com.sfm2023.BikeRevolution.Repositories.ResourceCostRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class ResourceCostController {
    @Autowired
    ResourceCostRepository resourceCostRepository;

    public ArrayList<String> getNeededPartsByRepairId(Long repairId) {
        ArrayList<String> neededParts = new ArrayList<>();
        resourceCostRepository.findAll().forEach(resourceCost -> {
            if (resourceCost.getId().equals(repairId)) {
                neededParts.add(resourceCost.getPartId());
                neededParts.add(resourceCost.getPartQuantity());
            }
        });

        return neededParts;

    }

    public ArrayList<Long> getPartQuantity(@NonNull ArrayList<String> resourcesList) {

        String tmp = resourcesList.toString().replaceAll("[\\[\\],]", "");

        ArrayList<Long> partQuantity = new ArrayList<>();

        if (tmp.split(" ").length == 2) {
            partQuantity.add(Long.parseLong(tmp.split(" ")[1]));
        }
        else {
            partQuantity.add(Long.parseLong(tmp.split(" ")[2]));
            partQuantity.add(Long.parseLong(tmp.split(" ")[3]));
        }
        return partQuantity;
    }

    public ArrayList<Long> getPartId(@NonNull ArrayList<String> resourcesList) {

        String tmp = resourcesList.toString().replaceAll("[\\[\\],]", "");

        ArrayList<Long> partId = new ArrayList<>();

        if (tmp.split(" ").length == 2) {
            partId.add(Long.parseLong(tmp.split(" ")[0]));
        }
        else {
            partId.add(Long.parseLong(tmp.split(" ")[0]));
            partId.add(Long.parseLong(tmp.split(" ")[1]));
        }
        return partId;
    }
}
