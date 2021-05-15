package za.ac.cput;

/**
 * customCollection.java
 * This is a TDD program to show my understanding of the Collection interface
 * @author: Melven Johannes Booysen (219201277)
 * Date: 14 May 2021
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CustomCollection implements Collection
{
    private ArrayList<Object> items;

    public CustomCollection()
    {
        items = new ArrayList<>();

    }//** End of construction **

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o)
    {
        return items.add(o);

    }//** End of add method **

    @Override
    public boolean remove(Object o)
    {
        return items.remove(o);

    }//** End of remove method **

    public int find(Object o)
    {
        for(int i = 0; i < items.size(); i++)
        {
            if(items.get(i) == o)
            {
                return i;
            }
        }
        return -1;
    }//** End of find method **

    @Override
    public boolean addAll(Collection collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection collection) {
        return false;
    }

    @Override
    public boolean containsAll(Collection collection) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] objects) {
        return new Object[0];
    }
}//** End of class **
