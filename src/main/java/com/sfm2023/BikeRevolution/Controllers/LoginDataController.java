//package com.sfm2023.BikeRevolution.Controllers;
//
//import com.sfm2023.BikeRevolution.Repositories.Customers;
//import com.sfm2023.BikeRevolution.Repositories.CustomersRepository;
//import com.sfm2023.BikeRevolution.Repositories.LoginData;
//import com.sfm2023.BikeRevolution.Repositories.LoginDataRepository;
//import org.apache.tomcat.util.net.openssl.ciphers.Encryption;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Map;
//
//@RestController
//public class LoginDataController {
//    @Autowired
//    LoginDataRepository loginDataRepository;
//
//    @GetMapping("/logindata")
//    public List<LoginData> listAll(){
//        return loginDataRepository.findAll();
//    }
//
//    @GetMapping("/logindata/{id}")
//    public Customers listOneById(@PathVariable Long id){
//        return loginDataRepository.findOneById(id);
//    }
//
//
//    @PostMapping("/logindata")
//    public Customers create(@RequestBody Map<String, String> body){
//        Long id = Long.valueOf(body.get("id"));
//        String username = body.get("username");
//        String tmp = body.get("password");
//        Encryption
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
