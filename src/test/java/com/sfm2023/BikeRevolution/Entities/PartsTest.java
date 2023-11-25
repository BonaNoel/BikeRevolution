package com.sfm2023.BikeRevolution.Entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartsTest {

    @Test
    void testEquals() {
        Parts part1 = new Parts(1L, "BelsoGumi", 4, 100);
        Parts part2 = new Parts(1L, "BelsoGumi", 4, 100);
        Parts part3 = new Parts(2L, "KulsoGumi", 2, 50);

        assertEquals(part1, part2);
        assertNotEquals(part1, part3);
    }

    @Test
    void canEqual() {
        Parts part1 = new Parts(1L, "BelsoGumi", 4, 100);
        Parts part2 = new Parts(1L, "BelsoGumi", 4, 100);
        Parts part3 = new Parts(2L, "KulsoGumi", 2, 50);

        assertTrue(part1.canEqual(part2));
        assertTrue(part2.canEqual(part1)); // symmetric property
        //assertFalse(part1.canEqual(part3));
    }

    @Test
    void testHashCode() {
        Parts part1 = new Parts(1L, "BelsoGumi", 4, 100);
        Parts part2 = new Parts(1L, "BelsoGumi", 4, 100);
        Parts part3 = new Parts(2L, "KulsoGumi", 2, 50);

        assertEquals(part1.hashCode(), part2.hashCode());
        assertNotEquals(part1.hashCode(), part3.hashCode());
    }

    @Test
    void testToString() {
        Parts part = new Parts(1L, "BelsoGumi", 4, 100);
        String expectedToString = "Parts(id=1, name=BelsoGumi, quantity=4, price=100)";
        assertEquals(expectedToString, part.toString());
    }

    @Test
    void getId() {
        Long id = 1L;
        Parts part = new Parts();
        part.setId(id);
        assertEquals(id, part.getId());
    }

    @Test
    void getName() {
        String name = "BelsoGumi";
        Parts part = new Parts();
        part.setName(name);
        assertEquals(name, part.getName());
    }
    @Test
    void getQuantity() {
        Integer quantity = 4;
        Parts part = new Parts();
        part.setQuantity(quantity);
        assertEquals(quantity, part.getQuantity());
    }

    @Test
    void getPrice() {
        Integer price = 100;
        Parts part = new Parts();
        part.setPrice(price);
        assertEquals(price, part.getPrice());
    }

    @Test
    void setId() {
        Long id = 1L;
        Parts part = new Parts();
        part.setId(id);
        assertEquals(id, part.getId());
    }

    @Test
    void setName() {
        String name = "BelsoGumi";
        Parts part = new Parts();
        part.setName(name);
        assertEquals(name, part.getName());
    }

    @Test
    void setQuantity() {
        Integer quantity = 4;
        Parts part = new Parts();
        part.setQuantity(quantity);
        assertEquals(quantity, part.getQuantity());
    }

    @Test
    void setPrice() {
        Integer price = 100;
        Parts part = new Parts();
        part.setPrice(price);
        assertEquals(price, part.getPrice());
    }
}