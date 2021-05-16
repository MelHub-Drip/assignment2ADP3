package za.ac.cput;

/**
 * customList.java
 * This is a TDD program to show my understanding of the List interface
 * @author: Melven Johannes Booysen (219201277)
 * Date: 14 May 2021
 */

import java.util.*;

public class CustomList implements List
{

    private ArrayList<Object> arrayItems;

    public CustomList()
    {
        arrayItems = new ArrayList<>();

    }//** End of constructor **

    @Override
    public int size()
    {
        return arrayItems.size();
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
        return arrayItems.add(o);

    }//** End of add method **

    @Override
    public boolean remove(Object o)
    {
        return arrayItems.remove(o);

    }//** End of remove method **

    @Override
    public boolean addAll(Collection collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public Object set(int i, Object o) {
        return null;
    }

    @Override
    public void add(int i, Object o) {

    }

    @Override
    public Object remove(int i)
    {
        return arrayItems.remove(1);

    }//** End of remove method **

    public int find(Object o)
    {
        for(int i = 0; i < arrayItems.size(); i++)
        {
            if(arrayItems.get(i) == o)
            {
                return i;
            }
        }
        return -1;
    }//** End of find method **

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int i) {
        return null;
    }

    @Override
    public List subList(int i, int i1) {
        return null;
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
