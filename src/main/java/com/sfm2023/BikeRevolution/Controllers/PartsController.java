package com.sfm2023.BikeRevolution.Controllers;

import com.sfm2023.BikeRevolution.Repositories.Parts;
import com.sfm2023.BikeRevolution.Repositories.PartsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class PartsController {

    @Autowired
    PartsRepository partsRepository;

    @GetMapping("/parts")
    public List<Parts>  listAll(){
        return partsRepository.findAll();
    }

    @GetMapping("/parts/{id}")
    public Parts listOneById(@PathVariable Long id){
        return partsRepository.findOneById(id);
    }


    @PostMapping("/parts")
    public Parts create(@RequestBody Map<String, String> body){
        Long id = Long.valueOf(body.get("id"));
        String partName = body.get("partName");
        Integer partQuantity = Integer.valueOf(body.get("partQuantity"));
        String partPrice = body.get("partPrice");
        return partsRepository.save(new Parts(id, partName, partQuantity, partPrice));
    }

    @PutMapping("/blog/{id}")
    public Parts update(@PathVariable Long id, @RequestBody Map<String, String> body){
        Parts part = partsRepository.findOneById(id);
        part.setPartName(body.get("partName"));
        part.setPartQuantity(Integer.valueOf(body.get("partQuantity")));
        part.setPartPrice(body.get("partPrice"));
        return partsRepository.save(part);
    }

    @DeleteMapping("/parts/{id}")
    public boolean delete(@PathVariable Long id){
        partsRepository.deleteById(id);
        return true;
    }
}
