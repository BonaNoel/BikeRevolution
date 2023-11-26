package com.sfm2023.BikeRevolution.Controllers;

import com.sfm2023.BikeRevolution.Entities.WebCustomers;
import com.sfm2023.BikeRevolution.Repositories.WebCustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WebCustomerController {
    @Autowired
    WebCustomersRepository webCustomersRepository;


    public List<String> getWebCustomerNameAndDate() {
        List<WebCustomers> webCustomers = webCustomersRepository.findAll();
        List<String> webCustomerNames = new ArrayList<>();
        for (WebCustomers webCustomer : webCustomers) {
            webCustomerNames.add(webCustomer.getName() + " " + webCustomer.getDate());
        }
        return webCustomerNames;

    }

    public String getWebCustomerPhoneByDate(String date) {
        List<WebCustomers> webCustomers = webCustomersRepository.findAll();
        for (WebCustomers webCustomer : webCustomers) {
            System.out.println(webCustomer.getDate());
            if (webCustomer.getDate().equals(date)) {
                return webCustomer.getPhone();
            }
        }
        return null;
    }

    public String getWebCustomerDescriptionByDate(String date) {
        List<WebCustomers> webCustomers = webCustomersRepository.findAll();
        for (WebCustomers webCustomer : webCustomers) {
            if (webCustomer.getDate().equals(date)) {
                return webCustomer.getDescription();
            }
        }
        return null;
    }
}
