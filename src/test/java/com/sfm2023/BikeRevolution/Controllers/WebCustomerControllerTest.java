package com.sfm2023.BikeRevolution.Controllers;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import com.sfm2023.BikeRevolution.Entities.WebCustomers;
import com.sfm2023.BikeRevolution.Repositories.WebCustomersRepository;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class WebCustomerControllerTest {

    @Mock
    private WebCustomersRepository webCustomersRepository;

    @InjectMocks
    private WebCustomerController webCustomerController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetWebCustomerNameAndDate() {

        WebCustomers customer1 = new WebCustomers(1L, "Customer1", "123456789", "2023-01-01", "Description1");
        WebCustomers customer2 = new WebCustomers(2L, "Customer2", "987654321", "2023-01-02", "Description2");

        when(webCustomersRepository.findAll()).thenReturn(Arrays.asList(customer1, customer2));

        List<String> result = webCustomerController.getWebCustomerNameAndDate();

        List<String> expectedList = Arrays.asList("Customer1 2023-01-01", "Customer2 2023-01-02");
        assertEquals(expectedList, result);
    }

    @Test
    public void testGetWebCustomerPhoneByDate() {

        WebCustomers customer1 = new WebCustomers(1L, "Customer1", "123456789", "2023-01-01", "Description1");
        WebCustomers customer2 = new WebCustomers(2L, "Customer2", "987654321", "2023-01-02", "Description2");

        when(webCustomersRepository.findAll()).thenReturn(Arrays.asList(customer1, customer2));

        String phone = webCustomerController.getWebCustomerPhoneByDate("2023-01-01");

        assertEquals("123456789", phone);

        String nonExistentPhone = webCustomerController.getWebCustomerPhoneByDate("2023-03-01");
        assertNull(nonExistentPhone);
    }

    @Test
    public void testGetWebCustomerDescriptionByDate() {

        WebCustomers customer1 = new WebCustomers(1L, "Customer1", "123456789","2023-01-01" ,"Description1");
        WebCustomers customer2 = new WebCustomers(2L, "Customer2", "987654321", "2023-01-02", "Description2");

        when(webCustomersRepository.findAll()).thenReturn(Arrays.asList(customer1, customer2));

        String description = webCustomerController.getWebCustomerDescriptionByDate("2023-01-01");

        assertEquals("Description1", description);

        String nonExistentDescription = webCustomerController.getWebCustomerDescriptionByDate("2023-03-01");
        assertNull(nonExistentDescription);
    }
}
