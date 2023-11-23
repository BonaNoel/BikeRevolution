//package com.sfm2023.BikeRevolution.Controllers;
//
//import com.sfm2023.BikeRevolution.Entities.Customers;
//import com.sfm2023.BikeRevolution.Repositories.CustomersRepository;
//import com.sfm2023.BikeRevolution.Entities.Parts;
//import com.sfm2023.BikeRevolution.Repositories.PartsRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Map;
//
//@RestController
//public class CustomersController {
//
//    @Autowired
//    CustomersRepository customersRepository;
//
//    @GetMapping("/customers")
//    public List<Customers> listAll(){
//        return customersRepository.findAll();
//    }
//
//    @GetMapping("/customers/{id}")
//    public Customers listOneById(@PathVariable Long id){
//        return customersRepository.findOneById(id);
//    }
//
//
//    @PostMapping("/customers")
//    public Customers create(@RequestBody Map<String, String> body){
//        Long id = Long.valueOf(body.get("id"));
//        String customerName = body.get("customerName");
//        String customerPhone = body.get("customerPhone");
//        String customerDate = body.get("customerDate");
//        String customerDescription = body.get("customerDescription");
//        return customersRepository.save(new Customers(id, customerName, customerPhone, customerDate, customerDescription));
//    }
//
//    @PutMapping("/customers/{id}")
//    public Customers update(@PathVariable Long id, @RequestBody Map<String, String> body){
//        Customers customer = customersRepository.findOneById(id);
//        customer.setCustomerName(body.get("customerName"));
//        customer.setCustomerPhone(body.get("customerPhone"));
//        customer.setCustomerDate(body.get("customerDate"));
//        customer.setCustomerDescription(body.get("customerDescription"));
//        return customersRepository.save(customer);
//    }
//
//    @DeleteMapping("/customers/{id}")
//    public boolean delete(@PathVariable Long id){
//        customersRepository.deleteById(id);
//        return true;
//    }
//}
