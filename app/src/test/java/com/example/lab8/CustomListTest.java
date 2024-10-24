package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
/** • Implement has city, delete city, and count cities (same as lab 6), however, this time using TDD.

 • Create each functionality one at a time, creating (and pushing) a test to create a failing build, before adding functionality to make it pass.

 • e.g., create hasCity test, push for failing build, write functionality for hasCity to make passing build. Repeat for delete city and count cities.

**/

 //import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    private CustomList list;

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    // @Test declares Unit Test
    @Test
    public void addCityTest() {
        CustomList list = MockCityList();
        int expectedCountBeforeAdd = 0;
        assertEquals(expectedCountBeforeAdd, list.getCount(), "Count should have been 0");
        City cityToAdd = new City("Nanton", "AB");
        list.addCity(cityToAdd);

        // check that count of cities increased by 1
        int expectedCountAfterAdd = 1;
        assertEquals(expectedCountAfterAdd, list.getCount(), "The city was added successfully");
    }
    /**
     * checks if city has city
     *
     */
    @Test
    void testHasCity() {
        CustomList list = MockCityList();
        City cityToCheck = new City("Nanton", "AB");
        assertFalse(list.hasCity(cityToCheck));
        list.addCity(cityToCheck);
        assertTrue(list.hasCity(cityToCheck));
    }
}
