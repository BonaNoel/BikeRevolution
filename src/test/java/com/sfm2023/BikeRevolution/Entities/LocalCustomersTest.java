package com.sfm2023.BikeRevolution.Entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalCustomersTest {

    @Test
    void testEquals() {
        LocalCustomers customer1 = LocalCustomers.builder().id(1L).name("John").phone("123-456").repairTypeId(2L).build();
        LocalCustomers customer2 = LocalCustomers.builder().id(1L).name("John").phone("123-456").repairTypeId(2L).build();
        LocalCustomers customer3 = LocalCustomers.builder().id(2L).name("Jane").phone("789-012").repairTypeId(3L).build();

        assertEquals(customer1, customer2);
        assertNotEquals(customer1, customer3);
    }

    @Test
    void canEqual() {
        LocalCustomers customer1 = LocalCustomers.builder().id(1L).name("John").phone("123-456").repairTypeId(2L).build();
        LocalCustomers customer2 = LocalCustomers.builder().id(1L).name("John").phone("123-456").repairTypeId(2L).build();
        LocalCustomers customer3 = LocalCustomers.builder().id(2L).name("Jane").phone("789-012").repairTypeId(3L).build();

        assertTrue(customer1.canEqual(customer2));
        //assertFalse(customer1.canEqual(customer3));
    }

    @Test
    void testHashCode() {
        LocalCustomers customer1 = LocalCustomers.builder().id(1L).name("John").phone("123-456").repairTypeId(2L).build();
        LocalCustomers customer2 = LocalCustomers.builder().id(1L).name("John").phone("123-456").repairTypeId(2L).build();
        LocalCustomers customer3 = LocalCustomers.builder().id(2L).name("Jane").phone("789-012").repairTypeId(3L).build();

        assertEquals(customer1.hashCode(), customer2.hashCode());
        assertNotEquals(customer1.hashCode(), customer3.hashCode());
    }

    @Test
    void testToString() {
        LocalCustomers customer = LocalCustomers.builder().id(1L).name("John").phone("123-456").repairTypeId(2L).build();
        String expectedToString = "LocalCustomers(id=1, name=John, phone=123-456, repairTypeId=2, completed=null)";
        assertEquals(expectedToString, customer.toString());
    }

    @Test
    void getId() {
        Long id = 1L;
        LocalCustomers customer = LocalCustomers.builder().id(id).name("John").phone("123-456").repairTypeId(2L).build();
        assertEquals(id, customer.getId());
    }

    @Test
    void getName() {
        String name = "John";
        LocalCustomers customer = LocalCustomers.builder().id(1L).name(name).phone("123-456").repairTypeId(2L).build();
        assertEquals(name, customer.getName());
    }

    @Test
    void getPhone() {
        String phone = "123-456";
        LocalCustomers customer = LocalCustomers.builder().id(1L).name("John").phone(phone).repairTypeId(2L).build();
        assertEquals(phone, customer.getPhone());
    }

    @Test
    void getRepairTypeId() {
        Long repairTypeId = 2L;
        LocalCustomers customer = LocalCustomers.builder().id(1L).name("John").phone("123-456").repairTypeId(repairTypeId).build();
        assertEquals(repairTypeId, customer.getRepairTypeId());
    }

    @Test
    void setId() {
        Long id = 1L;
        LocalCustomers customer = new LocalCustomers();
        customer.setId(id);
        assertEquals(id, customer.getId());
    }

    @Test
    void setName() {
        String name = "John";
        LocalCustomers customer = new LocalCustomers();
        customer.setName(name);
        assertEquals(name, customer.getName());
    }

    @Test
    void setPhone() {
        String phone = "123-456";
        LocalCustomers customer = new LocalCustomers();
        customer.setPhone(phone);
        assertEquals(phone, customer.getPhone());
    }

    @Test
    void setRepairTypeId() {
        Long repairTypeId = 2L;
        LocalCustomers customer = new LocalCustomers();
        customer.setRepairTypeId(repairTypeId);
        assertEquals(repairTypeId, customer.getRepairTypeId());
    }

    @Test
    void builder() {
        LocalCustomers customer = LocalCustomers.builder().id(1L).name("John").phone("123-456").repairTypeId(2L).build();
        assertEquals(1L, customer.getId());
        assertEquals("John", customer.getName());
        assertEquals("123-456", customer.getPhone());
        assertEquals(2L, customer.getRepairTypeId());
    }
}