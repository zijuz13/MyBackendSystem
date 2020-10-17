package com.huajun123;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SorterTester {
    private int[] array=new int[]{23,112,23,23,21,21,24,2,3,3,6,8,9,0,10};
    @Before
    public void demo1(){
        new ImprovedBubbleSorter().sort(array);
        System.out.println(Arrays.toString(array));
    }
    @Test
    public void demo2(){
        new ImprovedSelectSort().sort(array);
        System.out.println(Arrays.toString(array));
    }
    @Test
    public void demo3(){
        new InsertSorter().sort(array);
        System.out.println(Arrays.toString(array));
    }
    @Test
    public void demo4(){
        BinarySearch2 binarySearch = new BinarySearch2(array);
        System.out.println(binarySearch.search(3).toString());
    }
}
