package com.sfm2023.BikeRevolution.Controllers;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import com.sfm2023.BikeRevolution.Entities.Parts;
import com.sfm2023.BikeRevolution.Repositories.PartsRepository;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartsControllerTest {

    @Mock
    private PartsRepository partsRepository;

    @InjectMocks
    private PartsController partsController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetPartNameAndQuantity() {

        Parts part1 = new Parts(1L, "Part1", 10, 5);
        Parts part2 = new Parts(2L, "Part2", 20, 8);

        when(partsRepository.findAll()).thenReturn(Arrays.asList(part1, part2));

        ObservableList<String> result = partsController.getPartNameAndQuantity();

        List<String> expectedList = Arrays.asList("Part1 10 db", "Part2 20 db");
        assertEquals(expectedList, result);
    }
}
