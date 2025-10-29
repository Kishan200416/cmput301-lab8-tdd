package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    void testHasCity() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "Alberta");

        // HasCity Exists Now
        assertFalse(list.hasCity(city));

        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    void testDeleteCity() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "Alberta");
        list.addCity(city); // Add a city so we can test deleting it

        // This 'deleteCity' method does exist now, so it will not fail
        list.deleteCity(city);

        // We expect the city to be gone
        assertFalse(list.hasCity(city));
    }

    @Test
    void testCountCities() {
        CustomList list = new CustomList();

        // Count should be 0 for a new list
        // This 'countCities' method does exist now, so it will pass
        assertEquals(0, list.countCities());

        // Count should be 1 after adding a city
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(1, list.countCities());
    }

}
