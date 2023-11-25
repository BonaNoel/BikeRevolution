package com.sfm2023.BikeRevolution.Entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepairsTest {

    @Test
    void testGetId() {
        Repairs repairs = new Repairs(1L, "RepairName", "Description", "100");
        assertEquals(1L, repairs.getId());
    }

    @Test
    void testGetName() {
        Repairs repairs = new Repairs(1L, "RepairName", "Description", "100");
        assertEquals("RepairName", repairs.getName());
    }

    @Test
    void testGetDescription() {
        Repairs repairs = new Repairs(1L, "RepairName", "Description", "100");
        assertEquals("Description", repairs.getDescription());
    }

    @Test
    void testGetPrice() {
        Repairs repairs = new Repairs(1L, "RepairName", "Description", "100");
        assertEquals("100", repairs.getPrice());
    }

    @Test
    void testSetId() {
        Repairs repairs = new Repairs();
        repairs.setId(1L);
        assertEquals(1L, repairs.getId());
    }

    @Test
    void testSetName() {
        Repairs repairs = new Repairs();
        repairs.setName("RepairName");
        assertEquals("RepairName", repairs.getName());
    }

    @Test
    void testSetDescription() {
        Repairs repairs = new Repairs();
        repairs.setDescription("Description");
        assertEquals("Description", repairs.getDescription());
    }


    @Test
    void testSetPrice() {
        Repairs repairs = new Repairs();
        repairs.setPrice("100");
        assertEquals("100", repairs.getPrice());
    }

    @Test
    void testEquals() {
        Repairs repairs1 = new Repairs(1L, "RepairName1", "Description", "100");
        Repairs repairs2 = new Repairs(1L, "RepairName1", "Description", "100");
        Repairs repairs3 = new Repairs(1L, "RepairName2", "Description", "200");

        assertEquals(repairs1, repairs2);
        assertNotEquals(repairs1, repairs3);
    }

    @Test
    void testCanEqual() {
        Repairs repairs1 = new Repairs(1L, "RepairName", "Description", "100");
        Repairs repairs2 = new Repairs(1L, "RepairName", "Description", "100");

        assertTrue(repairs1.canEqual(repairs2));
    }

    @Test
    void testHashCode() {
        Repairs repairs1 = new Repairs(1L, "RepairName", "Description", "100");
        Repairs repairs2 = new Repairs(1L, "RepairName", "Description", "100");

        assertEquals(repairs1.hashCode(), repairs2.hashCode());
    }

    @Test
    void testToString() {
        Repairs repairs = new Repairs(1L, "RepairName", "Description", "100");
        String expectedToString = "Repairs(id=1, name=RepairName, description=Description, price=100)";

        assertEquals(expectedToString, repairs.toString());
    }
}