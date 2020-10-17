package com.huajun123;
//选择排序
public class ImprovedSelectSort {
    public void sort(int[] a){
        //算法复杂度为n2
        for(int i=1;i<=a.length-1;i++){
            //设置最大值是a[i-1]
            int max=a[i-1];
            //设置index i-1
            int index=i-1;
            for(int j=i;j<a.length;j++){
                if(a[j]>max){
                    max=a[j];
                    index=j;
                }
            }
            if(index!=(i-1)){
                a[index]=a[i-1];
                a[i-1]=max;
            }
        }
    }
}
