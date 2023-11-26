package com.sfm2023.BikeRevolution.Entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResourceCostTest {

    @Test
    void testEquals() {
        ResourceCost resourceCost1 = new ResourceCost(1L, "part1", "10");
        ResourceCost resourceCost2 = new ResourceCost(1L, "part1", "10");
        ResourceCost resourceCost3 = new ResourceCost(2L, "part2", "5");

        assertEquals(resourceCost1, resourceCost2);
        assertNotEquals(resourceCost1, resourceCost3);
    }

    @Test
    void canEqual() {
        ResourceCost resourceCost1 = new ResourceCost(1L, "part1", "10");
        ResourceCost resourceCost2 = new ResourceCost(1L, "part1", "10");
        ResourceCost resourceCost3 = new ResourceCost(2L, "part2", "5");

        assertTrue(resourceCost1.canEqual(resourceCost2));
        //assertFalse(resourceCost1.canEqual(resourceCost3));
    }

    @Test
    void testHashCode() {
        ResourceCost resourceCost1 = new ResourceCost(1L, "part1", "10");
        ResourceCost resourceCost2 = new ResourceCost(1L, "part1", "10");
        ResourceCost resourceCost3 = new ResourceCost(2L, "part2", "5");

        assertEquals(resourceCost1.hashCode(), resourceCost2.hashCode());
        assertNotEquals(resourceCost1.hashCode(), resourceCost3.hashCode());
    }

    @Test
    void testToString() {
        ResourceCost resourceCost = new ResourceCost(1L, "part1", "10");
        String expectedToString = "ResourceCost(id=1, partId=part1, PartQuantity=10)";

        assertEquals(expectedToString, resourceCost.toString());
    }

    @Test
    void getId() {
        ResourceCost resourceCost = new ResourceCost(1L, "part1", "10");
        assertEquals(1L, resourceCost.getId());
    }

    @Test
    void getPartId() {
        ResourceCost resourceCost = new ResourceCost(1L, "part1", "10");
        assertEquals("part1", resourceCost.getPartId());
    }

    @Test
    void getPartQuantity() {
        ResourceCost resourceCost = new ResourceCost(1L, "part1", "10");
        assertEquals("10", resourceCost.getPartQuantity());
    }

    @Test
    void setId() {
        ResourceCost resourceCost = new ResourceCost();
        resourceCost.setId(1L);
        assertEquals(1L, resourceCost.getId());
    }

    @Test
    void setPartId() {
        ResourceCost resourceCost = new ResourceCost();
        resourceCost.setPartId("part1");
        assertEquals("part1", resourceCost.getPartId());
    }

    @Test
    void setPartQuantity() {
        ResourceCost resourceCost = new ResourceCost();
        resourceCost.setPartQuantity("10");
        assertEquals("10", resourceCost.getPartQuantity());
    }
}