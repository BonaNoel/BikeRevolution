package com.sfm2023.BikeRevolution.Entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebCustomersTest {

    @Test
    void testGetId() {
        WebCustomers webCustomers = new WebCustomers();
        webCustomers.setId(1L);
        assertEquals(1L, webCustomers.getId());
    }

    @Test
    void testGetName() {
        WebCustomers webCustomers = new WebCustomers();
        webCustomers.setName("John Doe");
        assertEquals("John Doe", webCustomers.getName());
    }


    @Test
    void testGetPhone() {
        WebCustomers webCustomers = new WebCustomers();
        webCustomers.setPhone("123-456-7890");
        assertEquals("123-456-7890", webCustomers.getPhone());
    }

    @Test
    void testGetDate() {
        WebCustomers webCustomers = new WebCustomers();
        webCustomers.setDate("2023-11-25");
        assertEquals("2023-11-25", webCustomers.getDate());
    }

    @Test
    void testGetDescription() {
        WebCustomers webCustomers = new WebCustomers();
        webCustomers.setDescription("Customer description");
        assertEquals("Customer description", webCustomers.getDescription());
    }

    @Test
    void testSetId() {
        WebCustomers webCustomers = new WebCustomers();
        webCustomers.setId(1L);
        assertEquals(1L, webCustomers.getId());
    }

    @Test
    void testSetName() {
        WebCustomers webCustomers = new WebCustomers();
        webCustomers.setName("John Doe");
        assertEquals("John Doe", webCustomers.getName());
    }

    @Test
    void testSetPhone() {
        WebCustomers webCustomers = new WebCustomers();
        webCustomers.setPhone("123-456-7890");
        assertEquals("123-456-7890", webCustomers.getPhone());
    }

    @Test
    void testSetDate() {
        WebCustomers webCustomers = new WebCustomers();
        webCustomers.setDate("2023-11-25");
        assertEquals("2023-11-25", webCustomers.getDate());
    }

    @Test
    void testSetDescription() {
        WebCustomers webCustomers = new WebCustomers();
        webCustomers.setDescription("Customer description");
        assertEquals("Customer description", webCustomers.getDescription());
    }

    @Test
    void testEquals() {
        WebCustomers webCustomers1 = new WebCustomers(1L, "John", "123-456-7890", "2023-11-25", "Customer description");
        WebCustomers webCustomers2 = new WebCustomers(1L, "John", "123-456-7890", "2023-11-25", "Customer description");
        WebCustomers webCustomers3 = new WebCustomers(2L, "Jane", "987-654-3210", "2023-11-26", "Another description");

        assertEquals(webCustomers1, webCustomers2);
        assertNotEquals(webCustomers1, webCustomers3);
    }

    @Test
    void testCanEqual() {
        WebCustomers webCustomers1 = new WebCustomers(1L, "John Doe", "123-456-7890", "2023-11-25", "Customer description");
        WebCustomers webCustomers2 = new WebCustomers(1L, "John Doe", "123-456-7890", "2023-11-25", "Customer description");

        assertTrue(webCustomers1.canEqual(webCustomers2));
    }

    @Test
    void testHashCode() {
        WebCustomers webCustomers1 = new WebCustomers(1L, "John Doe", "123-456-7890", "2023-11-25", "Customer description");
        WebCustomers webCustomers2 = new WebCustomers(1L, "John Doe", "123-456-7890", "2023-11-25", "Customer description");

        assertEquals(webCustomers1.hashCode(), webCustomers2.hashCode());
    }

    @Test
    void testToString() {
        WebCustomers webCustomers = new WebCustomers(1L, "John Doe", "123-456-7890", "2023-11-25", "Customer description");
        String expectedToString = "WebCustomers(id=1, name=John Doe, phone=123-456-7890, date=2023-11-25, description=Customer description)";

        assertEquals(expectedToString, webCustomers.toString());
    }
}