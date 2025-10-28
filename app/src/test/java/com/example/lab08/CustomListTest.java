package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    void testHasCity() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "Alberta");

        // The 'hasCity' method doesn't exist yet, so this line will cause an error!
        assertFalse(list.hasCity(city));

        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

}
