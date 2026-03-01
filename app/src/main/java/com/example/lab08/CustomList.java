package com.example.lab08;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// Comment for initial commit to check workflow
public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    public void deleteCity(City city) {
        if (!cities.remove(city)) {
            throw new NoSuchElementException("City was not found: " + city.getCityName());
        }
    }
}
