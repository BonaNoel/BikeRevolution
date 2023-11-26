package com.sfm2023.BikeRevolution.Controllers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import com.sfm2023.BikeRevolution.Entities.LocalCustomers;
import com.sfm2023.BikeRevolution.Repositories.LocalCustomersRepository;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.List;

public class LocalCustomersControllerTest {

    @Mock
    private LocalCustomersRepository localCustomersRepository;

    @InjectMocks
    private LocalCustomersController localCustomersController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSaveLocalCustomer() {

        String name = "John";
        String phoneNumber = "123456789";
        Long repairTypeId = 1L;


        when(localCustomersRepository.save(any(LocalCustomers.class))).thenReturn(new LocalCustomers());


        localCustomersController.saveLocalCustomer(name, phoneNumber, repairTypeId);


        verify(localCustomersRepository, times(1)).save(argThat(localCustomers -> {

            return localCustomers.getName().equals(name)
                    && localCustomers.getPhone().equals(phoneNumber)
                    && localCustomers.getRepairTypeId().equals(repairTypeId);
        }));
    }

    @Test
    public void testGetLastRepairTypeId() {

        LocalCustomers localCustomer1 = new LocalCustomers();
        localCustomer1.setRepairTypeId(1L);

        LocalCustomers localCustomer2 = new LocalCustomers();
        localCustomer2.setRepairTypeId(2L);


        when(localCustomersRepository.findAll()).thenReturn(List.of(localCustomer1, localCustomer2));


        Long lastRepairTypeId = localCustomersController.getLastRepairTypeId();


        assertEquals(2L, lastRepairTypeId);
    }
}