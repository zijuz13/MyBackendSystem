package com.huajun123;

import org.junit.Before;
import org.junit.Test;

public class LinkMapTester {
    private ILinkMap<String,String> fucker;
    @Before
    public void demo3(){
        fucker=new LinkedMap<>();
        fucker.put("hujkc123","huajun123");
    }
    public void demo1(){
        fucker.show();
        System.out.println(fucker.getValue("j"));
    }
    @Test
    public void reverseList(){
        ILinkMap<String, String> stringStringILinkMap = fucker.reverseMap();
        stringStringILinkMap.show();
        stringStringILinkMap.reverseMap().show();
    }
}
