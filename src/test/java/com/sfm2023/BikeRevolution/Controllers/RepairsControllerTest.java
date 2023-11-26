package com.sfm2023.BikeRevolution.Controllers;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import com.sfm2023.BikeRevolution.Entities.Repairs;
import com.sfm2023.BikeRevolution.Repositories.RepairsRepository;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepairsControllerTest {

    @Mock
    private RepairsRepository repairsRepository;

    @InjectMocks
    private RepairsController repairsController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetRepairsName() {

        Repairs repair1 = new Repairs(1L, "Repair1", "Description1", "30");
        Repairs repair2 = new Repairs(2L, "Repair2", "Description2", "40");


        when(repairsRepository.findAll()).thenReturn(Arrays.asList(repair1, repair2));


        ObservableList<String> result = repairsController.getRepairsName();


        List<String> expectedList = Arrays.asList("Repair1", "Repair2");
        assertEquals(expectedList, result);
    }

    @Test
    public void testConvertRepairNameToRepairId() {

        Repairs repair1 = new Repairs(1L, "Repair1", "Description1", "30");
        Repairs repair2 = new Repairs(2L, "Repair2", "Description2", "40");


        when(repairsRepository.findAll()).thenReturn(Arrays.asList(repair1, repair2));

        Long repairId = repairsController.convertRepairNameToRepairId("Repair1");


        assertEquals(1L, repairId);
    }

    @Test
    public void testConvertRepairIdToRepairName() {

        Repairs repair1 = new Repairs(1L, "Repair1", "Description1", "30");
        Repairs repair2 = new Repairs(2L, "Repair2", "Description2", "40");

        when(repairsRepository.findAll()).thenReturn(Arrays.asList(repair1, repair2));


        String repairName = repairsController.convertRepairIdToRepairName(2L);

        assertEquals("Repair2", repairName);
    }

    @Test
    public void testGetRepairNameById() {

        Repairs repair1 = new Repairs(1L, "Repair1", "Description1", "30");


        when(repairsRepository.findById(1L)).thenReturn(Optional.of(repair1));


        String repairName = repairsController.getRepairNameById(1L);


        assertEquals("Repair1", repairName);
    }

    @Test
    public void testGetRepairDescriptionById() {

        Repairs repair1 = new Repairs(1L, "Repair1", "Description1", "30");

        when(repairsRepository.findById(1L)).thenReturn(Optional.of(repair1));


        String repairDescription = repairsController.getRepairDescriptionById(1L);

        assertEquals("Description1", repairDescription);
    }
}
