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

    @Test
    void testDeleteCity() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "Alberta");
        list.addCity(city); // Add a city so we can test deleting it

        // This 'deleteCity' method doesn't exist yet, so it will fail
        list.deleteCity(city);

        // We expect the city to be gone
        assertFalse(list.hasCity(city));
    }

}
