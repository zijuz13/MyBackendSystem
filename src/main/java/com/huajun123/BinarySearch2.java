package com.huajun123;

import java.util.ArrayList;
import java.util.List;
//二分搜索可以返回多个相同值的所有indexes
public class BinarySearch2 {
    private int[] array;
    public BinarySearch2(int[] array){
        this.array=array;
    }
    public List<Integer> search(int element){
        return this.binarySearch(element,0,array.length-1);
    }
    private List<Integer> binarySearch(int element,int left,int right){
        if(left>right){
            return new ArrayList<>();
        }
        int mid=(left+right)/2;
        if(array[mid]<element){
           return this.binarySearch(element,mid+1,right);
        }else if(array[mid]>element){
            return this.binarySearch(element,left,mid-1);
        }else{
            List<Integer> resultList=new ArrayList<>();
            resultList.add(mid);
            int left1=mid-1;
            int right1=mid+1;
            while(0<=left1&&array[left1]==element){
                resultList.add(left1);
                left1--;
            }
            while(right1<=array.length-1&&array[right1]==element){
                resultList.add(right1);
                right1++;
            }
            return resultList;
        }
    }
}
