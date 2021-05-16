package za.ac.cput;

/**
 * customSet.java
 * This is a TDD program to show my understanding of the Set interface
 * @author: Melven Johannes Booysen (219201277)
 * Date: 14 May 2021
 */

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CustomSet implements Set
{
    private HashSet<Object> setItems;

    public CustomSet()
    {
        setItems = new HashSet<>();

    }//** End of constructor **

    @Override
    public int size()
    {
        return setItems.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o)
    {
        return setItems.contains(o);

    }//** End of contains method **

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
        return setItems.add(o);

    }//** End of add method **

    @Override
    public boolean remove(Object o)
    {
        return setItems.remove(o);

    }//** End of remove method **


    @Override
    public boolean addAll(Collection collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection collection) {
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
