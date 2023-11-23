//package com.sfm2023.BikeRevolution.Controllers;
//
//import com.sfm2023.BikeRevolution.Entities.Repairs;
//import com.sfm2023.BikeRevolution.Repositories.RepairsRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Map;
//
//@RestController
//public class RepairsController {
//
//    @Autowired
//    RepairsRepository repairsRepository;
//
//    @GetMapping("/repairs")
//    public List<Repairs> listAll(){
//        return repairsRepository.findAll();
//    }
//
//    @GetMapping("/repairs/{id}")
//    public Repairs listOneById(@PathVariable Long id){
//        return repairsRepository.findOneById(id);
//    }
//
//    @PostMapping("/repairs")
//    public Repairs create(@RequestBody Map<String, String> body){
//        Long id = Long.valueOf(body.get("id"));
//        String repairName = body.get("repairName");
//        String repairDescription = body.get("repairDescription");
//        String repairPrice = body.get("repairPrice");
//        return repairsRepository.save(new Repairs(id, repairName, repairDescription, repairPrice));
//    }
//
//    @PutMapping("/repairs/{id}")
//    public Repairs update(@PathVariable Long id, @RequestBody Map<String, String> body){
//        Repairs repair = repairsRepository.findOneById(id);
//        repair.setRepairName(body.get("repairName"));
//        repair.setRepairDescription(body.get("repairDescription"));
//        repair.setRepairCost(body.get("repairCost"));
//        return repairsRepository.save(repair);
//    }
//
//    @DeleteMapping("/repairs/{id}")
//    public boolean delete(@PathVariable Long id){
//        repairsRepository.deleteById(id);
//        return true;
//    }
//}
