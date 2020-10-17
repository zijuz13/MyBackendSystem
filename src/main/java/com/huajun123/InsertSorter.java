package com.huajun123;

public class InsertSorter {
    public void sort(int[] a){
        for(int i=1;i<=a.length-1;i++){
            int insertIndex=i-1;
            int insertVal=a[i];
           while(0<=insertIndex&&a[insertIndex]<insertVal){
               a[insertIndex+1]=a[insertIndex];
               insertIndex--;
           }
           a[insertIndex+1]=insertVal;
        }
    }
}
