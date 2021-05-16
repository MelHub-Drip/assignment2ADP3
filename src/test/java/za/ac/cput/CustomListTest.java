package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomListTest
{
    private CustomList arrayItems;

    @BeforeEach
    void setUp()
    {
        arrayItems = new CustomList();
    }

    @Test
    void add()
    {
        arrayItems.add("Apple");
        arrayItems.add("Banana");
        arrayItems.add("Mango");

        assertTrue(arrayItems.add("Grapes"),"It failed");
        assertEquals(4,arrayItems.size());
    }

    @Test
    void remove()
    {
        arrayItems.add("Apple");
        arrayItems.add("Banana");
        arrayItems.add("Mango");

        arrayItems.remove("Banana");
        assertEquals(2,arrayItems.size());
    }

    @Test
    void find()
    {
        arrayItems.add("Apple");
        arrayItems.add("Banana");
        arrayItems.add("Mango");

        assertEquals(2,arrayItems.find("Mango"));
    }

}//** End of customListTest **