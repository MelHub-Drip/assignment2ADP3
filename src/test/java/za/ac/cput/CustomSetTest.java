package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomSetTest
{
    private CustomSet setItems;;

    @BeforeEach
    void setUp()
    {
        setItems = new CustomSet();
    }

    @Test
    void contains()
    {
        setItems.add("Rose");
        setItems.add("Tulip");
        setItems.add("Sunflower");

        assertTrue(setItems.contains("Tulip"),"It failed");
    }

    @Test
    void add()
    {
        setItems.add("Rose");
        setItems.add("Tulip");
        setItems.add("Sunflower");

        assertTrue(setItems.add("Daisy"),"It failed");
        assertEquals(4,setItems.size());
    }

    @Test
    void remove()
    {
        setItems.add("Rose");
        setItems.add("Tulip");
        setItems.add("Sunflower");

        setItems.remove("Tulip");
        assertEquals(2,setItems.size());
    }

}//** End of customSetTest **