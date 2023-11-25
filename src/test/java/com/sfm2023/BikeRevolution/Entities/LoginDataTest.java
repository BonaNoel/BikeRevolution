package com.sfm2023.BikeRevolution.Entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginDataTest {

    @Test
    void getId() {
        long id = 1L;
        LoginData loginData = new LoginData();
        loginData.setId(id);
        assertEquals(id, loginData.getId());
    }

    @Test
    void getUsername() {
        String username = "testUser";
        LoginData loginData = new LoginData();
        loginData.setUsername(username);
        assertEquals(username, loginData.getUsername());
    }

    @Test
    void getPassword() {
        String password = "testPassword";
        LoginData loginData = new LoginData();
        loginData.setPassword(password);
        assertEquals(password, loginData.getPassword());
    }

    @Test
    void setId() {
        long id = 1L;
        LoginData loginData = new LoginData();
        loginData.setId(id);
        assertEquals(id, loginData.getId());
    }

    @Test
    void setUsername() {
        String username = "testUser";
        LoginData loginData = new LoginData();
        loginData.setUsername(username);
        assertEquals(username, loginData.getUsername());
    }

    @Test
    void setPassword() {
        String password = "testPassword";
        LoginData loginData = new LoginData();
        loginData.setPassword(password);
        assertEquals(password, loginData.getPassword());
    }

    @Test
    void testEquals() {
        LoginData loginData1 = new LoginData(1L, "user1", "pass1");
        LoginData loginData2 = new LoginData(1L, "user1", "pass1");
        LoginData loginData3 = new LoginData(2L, "user2", "pass2");

        assertEquals(loginData1, loginData2);
        assertNotEquals(loginData1, loginData3);
    }

    @Test
    void canEqual() {
        LoginData loginData1 = new LoginData(1L, "user1", "pass1");
        LoginData loginData2 = new LoginData(1L, "user1", "pass1");
        LoginData loginData3 = new LoginData(2L, "user2", "pass2");

        assertTrue(loginData1.canEqual(loginData2));
        assertTrue(loginData2.canEqual(loginData1)); // symmetric property
        //assertFalse(loginData1.canEqual(loginData3));
    }

    @Test
    void testHashCode() {
        LoginData loginData1 = new LoginData(1L, "user1", "pass1");
        LoginData loginData2 = new LoginData(1L, "user1", "pass1");
        LoginData loginData3 = new LoginData(2L, "user2", "pass2");

        assertEquals(loginData1.hashCode(), loginData2.hashCode());
        assertNotEquals(loginData1.hashCode(), loginData3.hashCode());
    }

    @Test
    void testToString() {
        LoginData loginData = new LoginData(1L, "user1", "pass1");
        String expectedToString = "LoginData(id=1, username=user1, password=pass1)";
        assertEquals(expectedToString, loginData.toString());
    }
}