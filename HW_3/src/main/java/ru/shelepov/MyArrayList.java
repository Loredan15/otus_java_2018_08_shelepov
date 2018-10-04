package ru.shelepov;

import java.util.*;

public class MyArrayList<E> implements List<E> {

    private E[] elements;
    private int index;
    private int size;
    private static final int CAPACITY = 10;

    public MyArrayList(){
        elements = (E[])new Object[CAPACITY];
    }
    public MyArrayList(int capacity){
        elements = (E[]) new Object[capacity];
    }

    private void growArray(){
        E[] newArray = (E[])new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, size - 1);
        elements = newArray;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

    public boolean add(Object o) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public boolean addAll(int index, Collection c) {
        return false;
    }

    public void clear() {

    }

    public E get(int index) {
        return elements[index];
    }

    public E set(int index, Object element) {
        E oldValue = elements[index];
        elements[index] = (E) element;
        return oldValue;
    }

    public void add(int index, Object element) {

    }

    public E remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator listIterator() {
        return null;
    }

    public ListIterator listIterator(int index) {
        return null;
    }

    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
