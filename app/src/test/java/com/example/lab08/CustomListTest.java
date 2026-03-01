package com.example.lab08;

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
}
