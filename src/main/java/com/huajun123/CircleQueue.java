package com.huajun123;
//使用数组实现的循环队列
public class CircleQueue {
    //用来存储数的队列
    private int[] array;
    private int front;
    private int rear;
    private int maxSize;
    //初始化循环队列
    public CircleQueue(int size){
        //最后一个rear为空
        this.maxSize=size+1;
        this.front=0;
        this.rear=0;
        array=new int[this.maxSize];
    }
    //添加元素到队列中
    public void addQueue(int element){
      if(ifFull()){
          System.out.println("无法添加element,因为元素已经满了");
          return;
      }
      this.array[rear]=element;
      rear=(rear+1)%maxSize;
    }
    //弹出队列
    public int popFromQueue(){
        if(ifEmpty()){
            System.out.println("队列为空，不能pop");
            return 0;
        }
        int element=array[front];
        front=(front+1)%maxSize;
        return element;
    }
    public void show(){
        for(int i=front;i<front+this.size();i++){
            System.out.println(array[i%maxSize]);
        }
    }
    public int size(){
    return (rear+maxSize-front)%maxSize;
    }
    //判断是否已经满了
    public Boolean ifFull(){
        return (rear+1)%maxSize==front;
    }
    //判断是否已经空了
    public Boolean ifEmpty(){
        return rear==front;
    }
}
