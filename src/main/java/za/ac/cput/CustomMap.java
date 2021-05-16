package za.ac.cput;

/**
 * customMap.java
 * This is a TDD program to show my understanding of the Map interface
 * @author: Melven Johannes Booysen (219201277)
 * Date: 14 May 2021
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CustomMap implements Map
{
    private HashMap<Object, Object> mapItems;

    public CustomMap()
    {
        mapItems = new HashMap<>();

    }//** End of construction **

    @Override
    public int size()
    {
        return mapItems.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object o)
    {
        return mapItems.containsKey(o);

    }//** End of containsKey method **

    @Override
    public boolean containsValue(Object o)
    {
        return mapItems.containsValue(o);

    }//** End of containsValue method **

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public Object put(Object o, Object o2)
    {
        return mapItems.put(o, o2);

    }//** End of put method **

    @Override
    public Object remove(Object o)
    {
        return mapItems.remove(o);

    }//** End of put method **

    @Override
    public void putAll(Map map) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }

}//** End of class **
