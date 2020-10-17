package com.huajun123;

public class AlertSymbolComputing {
    public int getResult(int n){
        if(1==n){
            return 1;
        }else{
            return getResult(n-1)*n;
        }
    }
}
