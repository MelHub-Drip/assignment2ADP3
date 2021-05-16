package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomCollectionTest
{
    private CustomCollection items;


    @BeforeEach
    void setUp()
    {
        items = new CustomCollection();
    }

    @Test
    void add()
    {
        items.add("As");
        items.add("sign");
        items.add("ment");

        assertTrue(items.add("two"),"It failed");
        assertEquals(4,items.size());
    }

    @Test
    void remove()
    {
        items.add("As");
        items.add("sign");
        items.add("ment");

        items.remove("sign");
        assertEquals(2,items.size());

    }

    @Test
    void find()
    {
        items.add("As");
        items.add("sign");
        items.add("ment");

        assertEquals(2,items.find("ment"));
    }

}//** End of customCollectionTest **