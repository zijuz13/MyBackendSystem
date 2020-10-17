package com.huajun123;
//稀疏数组的打印
public class SparseArrat {
    public static void main(String[] args) {
      int[][] array=new int[10][10];
      array[1][2]=3;
      array[3][4]=5;
      array[6][7]=-23;
        TwoDimensionsArrayHandler twoDimensionsArrayHandler = new TwoDimensionsArrayHandler(array);
        twoDimensionsArrayHandler.printTransformedSparseArray();
        twoDimensionsArrayHandler.printOriginalArray();
        System.out.println("----------------------------------");
        twoDimensionsArrayHandler.getNewOriginalArray();
    }
}
