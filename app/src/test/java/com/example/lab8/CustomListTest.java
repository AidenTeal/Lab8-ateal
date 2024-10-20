package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * add a city to the list
     * check if list contains city
     */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertEquals(list.getCount(),listSize + 1);
        // check if list contains city
        assertEquals(list.hasCity(city), Boolean.TRUE);
    }

    /**
     * check if list contains city
     * delete the city from the list and check that it was removed
     */
    @Test
    public void deleteCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertEquals(list.getCount(),listSize + 1);
        listSize = list.getCount();
        // Check if list contains city
        assertEquals(list.hasCity(city), Boolean.TRUE);
        // Delete city and check that city was removed
        list.deleteCity(city);
        assertEquals(list.getCount(),listSize - 1);
    }

    /**
     * check list size and make sure it matches the number of cities that should be in the list
     */
    @Test
    public void cityCountTest() {
        list = MockCityList();
        assertEquals(list.getCount(), 0);
        City city = new City("Estevan", "SK");
        list.addCity(city);
        int listSize = list.getCount();
        assertEquals(list.getCount(),listSize);
        // extra line so I can recommit with proper commit message
    }
}
