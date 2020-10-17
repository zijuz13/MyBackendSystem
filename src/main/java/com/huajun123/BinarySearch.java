package com.huajun123;
//二分搜索类
public class BinarySearch {
    private int[] array;
    public BinarySearch(int[] array){
        this.array=array;
    }
    //使用二分法查找数组中val等于element的值
    public int findIndexByBinarySearch(int element){
        return this.binarySearch(element,0,array.length-1);
    }
    public int binarySearch(int element,int left,int right){
        if(left>right){
            return -1;
        }
        int mid=(left+right)/2;
        if(array[mid]>element){
            return this.binarySearch(element,left,mid-1);
        }else if(array[mid]<element){
            return this.binarySearch(element,mid+1,right);
        }else{
            return mid;
        }
    }
}
