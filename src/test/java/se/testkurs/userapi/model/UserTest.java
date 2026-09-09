package se.testkurs.userapi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void constructorSetsUserField() {
        User user = new User("anna", "anna@gmail.com", "password123");

        assertEquals("anna", user.getUsername());
        assertEquals("anna@gmail.com", user.getEmail());
        assertEquals("password123", user.getPassword());
    }
}
