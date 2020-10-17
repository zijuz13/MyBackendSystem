package com.huajun123;

import java.util.Optional;
//建立一个java类用来处理稀疏数组与二维数组的转化
public class TwoDimensionsArrayHandler {
    //原始二维数组
    private int[][] array;
    //转化后的稀疏数组
    private int[][] array1;
    public TwoDimensionsArrayHandler(int[][] array){
        this.array=array;
        this.initializeSparseArray();
    }
    //初始化稀疏数组，即将二维数组存储到稀疏数组中去
    private void initializeSparseArray(){
        Integer rows=array.length;
        Integer columns=array[0].length;
        Integer validNums=0;
        for(int i=0;i<rows;i++){
           for(int j=0;j<columns;j++){
               if(0!=array[i][j]) {
                 validNums++;
               }
           }
        }
        array1=new int[validNums+1][3];
        array1[0][0]=rows;
        array1[0][1]=columns;
        array1[0][2]=validNums;
        Integer index=1;
        //遍历二维数组给稀疏数组赋值
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(0!=array[i][j]) {
                    array1[index][0]=i;
                    array1[index][1]=j;
                    array1[index][2]=array[i][j];
                    index++;
                }
            }
        }
    }
    public int[][] getTransformedSparseArray(){
        if(Optional.ofNullable(array).isPresent())
        return array1;
        else {
            System.out.println("无法打印稀疏数组，因为没有一个指定的原数组");
            return null;
        }
    }
    public int[][] getOriginalArray(){
        return array;
    }
    public void printOriginalArray(){
        if(Optional.ofNullable(array).isPresent()){
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array[0].length;j++){
                    System.out.print(array[i][j]);
                }
                System.out.println("");
            }
        }else{
            System.out.println("无法打印原始数组，因为没有被指定");
        }
    }
    public void printTransformedSparseArray(){
        if(Optional.ofNullable(array1).isPresent()){
            for(int i=0;i<array1.length;i++){
                for(int j=0;j<array1[0].length;j++){
                    System.out.print(array1[i][j]);
                }
                System.out.println("");
            }
        }else{
            System.out.println("无法打印稀疏数组，因为没有被指定");
        }
    }
    //获得新的二维数组
    public int[][] getNewOriginalArray(){
        int[][] newArray=new int[array1[0][0]][array1[0][1]];
        //从第二行开始遍历
        for(int i=1;i<array1.length;i++){
             newArray[array1[i][0]][array1[i][1]]=array1[i][2];
        }
        for(int i=0;i<newArray.length;i++){
            for(int j=0;j<newArray[0].length;j++){
                System.out.print(newArray[i][j]);
            }
            System.out.println("");
        }
        return null;
    }
}
