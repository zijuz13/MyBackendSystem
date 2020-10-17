package com.huajun123;

import java.util.Arrays;

//堆排序手撸，这里选择的是升序排序,数据结构与算法快速突击
public class HeapSort {
    private static final int[] array=new int[]{32,1,778213123,32,3434,2432,1,32,23454,123,0,23,68,38,28};
    //每次对堆进行调整,以调整到大顶堆和小顶堆的目的
    //大顶堆，小顶堆，叶子节点，根节点，左子树，右子树
    private void adjustHeap(int[] a,int length,int index){
     int temp=a[index];
     for(int i=2*index+1;i<length;i=2*i+1){
         //如果右子节点
        if(i+1<length&&a[i+1]>a[i]){
            i++;
        }
        if(a[i]>temp){
            a[index]=a[i];
            index=i;
        }else{
            break;
        }
     }
     a[index]=temp;
    }
    //对外暴露sort方法用来排序
    public void sort(int[] array){
      for(int i=array.length;i>1;i--){
          for(int j=i/2-1;j>=0;j--){
              this.adjustHeap(array,i,j);
          }
          int temp=array[i-1];
          array[i-1]=array[0];
          array[0]=temp;
      }
    }
    public static void main(String[] args) {
        new HeapSort().sort(array);
        System.out.println(Arrays.toString(array));
    }
}
