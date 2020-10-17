package com.huajun123;
//冒泡排序
public class ImprovedBubbleSorter {
    public void sort(int[] a){
        //需要length-1次才能使数组排序,时间复杂度为O(n2)
      for(int i=1;i<=a.length-1;i++){
          boolean flag=false;
          for(int j=0;j<a.length-i;j++){
             if(a[j]>a[j+1]){
                 flag=true;
                 int temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
             }
          }
          if(!flag){
              break;
          }else{
              flag=false;
          }
      }
    }
}
