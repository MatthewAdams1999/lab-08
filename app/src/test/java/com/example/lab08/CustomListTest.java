package com.example.lab08;
import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity((calgary));

        // This will fail initially because hasCity() doesn't exist/is not implemented
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        list.deleteCity(calgary);

        assertFalse(list.hasCity(calgary));
    }
}
