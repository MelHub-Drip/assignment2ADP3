package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomMapTest
{
    private CustomMap mapItems;

    @BeforeEach
    void setUp()
    {
        mapItems = new CustomMap();
    }

    @Test
    void containsKey()
    {
        mapItems.put("Gauteng", "Pretoria");
        mapItems.put("Limpopo", "Polokwane" );
        mapItems.put("Western Cape", "Cape Town");

        assertTrue(mapItems.containsKey("Gauteng"));
    }

    @Test
    void containsValue()
    {
        mapItems.put("Gauteng", "Pretoria");
        mapItems.put("Limpopo", "Polokwane" );
        mapItems.put("Western Cape", "Cape Town");

        assertTrue(mapItems.containsValue("Pretoria"));
    }

    @Test
    void put()
    {
        mapItems.put("Gauteng", "Pretoria");
        mapItems.put("Limpopo", "Polokwane" );
        mapItems.put("Western Cape", "Cape Town");

        mapItems.put("KwaZulu-Natal", "Durban");
        assertEquals(4,mapItems.size());
    }

    @Test
    void remove()
    {
        mapItems.put("Gauteng", "Pretoria");
        mapItems.put("Limpopo", "Polokwane" );
        mapItems.put("Western Cape", "Cape Town");

        mapItems.remove("Limpopo");
        assertEquals(2,mapItems.size());
    }

}//** End of customMapTes **