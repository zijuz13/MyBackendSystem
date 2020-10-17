package com.huajun123;

import org.junit.Before;
import org.junit.Test;

public class CircleQueueTest {
    private CircleQueue circleQueue;
    @Before
    public void demo1(){
       circleQueue = new CircleQueue(6);
        int e1=2;
        int e2=3;
        int e3=1;
        circleQueue.addQueue(e1);
        circleQueue.addQueue(e2);
        circleQueue.addQueue(e3);
        circleQueue.addQueue(e1);
        circleQueue.addQueue(e1);
        circleQueue.addQueue(e1);
        circleQueue.addQueue(e2);
        circleQueue.show();
    }
    @Test
    public void demo2(){
        System.out.println("-----------------------");
        for(int i=0;i<6;i++) {
            circleQueue.popFromQueue();
        }
        circleQueue.show();
        System.out.println("-----------------------");
        circleQueue.addQueue(6);
        circleQueue.addQueue(7);
        circleQueue.addQueue(2);
        circleQueue.addQueue(3);
        circleQueue.addQueue(2);
        circleQueue.addQueue(1);
        circleQueue.addQueue(1);
        circleQueue.show();
    }
}
