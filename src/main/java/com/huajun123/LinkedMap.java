package com.huajun123;

import java.util.Optional;
import java.util.Stack;

public class LinkedMap<K,V> implements ILinkMap<K,V> {
    //头节点
    private Node<K,V> head;
    public LinkedMap(){
        //初始化链表，头节点为空
        this.head=new Node<>(null,null);
    }
    //内部类用来定义一个单向链表节点
    private class Node<K,V>{
        private K key;
        private V value;
        private Node<K,V> next;
        public Node(K k,V value){
            key=k;
            this.value=value;
        }
    }
    @Override
    //向map中放入k v键值对
    public void put(K k,V v){
        Node<K,V> temp=head.next;
        if(!Optional.ofNullable(temp).isPresent()){
            head.next=new Node<>(k,v);
        }else{
            while(true){
                if(!Optional.ofNullable(temp.next).isPresent()){
                    break;
                }
                temp=temp.next;
            }
            temp.next=new Node<>(k,v);
        }
    }
    @Override
    public void show(){
        Node<K,V> temp=head.next;
        if(!Optional.ofNullable(temp).isPresent()){
            System.out.println("不存在元素，所以无法打印，请添加元素后打印");
        }
        while(Optional.ofNullable(temp).isPresent()){
            System.out.println("key="+temp.key+",value="+temp.value);
            temp=temp.next;
        }
    }

    @Override
    public V getValue(K k) {
        Node<K,V> temp=head.next;
        if(!Optional.ofNullable(temp).isPresent()){
            System.out.println("map集合为空，根本没法获得相应值");
            return null;
        }
        while(Optional.ofNullable(temp).isPresent()){
            if(this.checkIfEqual(k,temp.key)){
                return temp.value;
            }
            temp=temp.next;
        }
        return null;
    }

    @Override
    public ILinkMap<K, V> reverseMap() {
        Node<K,V> temp=head.next;
        //如果链表只有一个或者没有元素，返回本身
        if(!Optional.ofNullable(temp).isPresent()||!Optional.ofNullable(temp.next).isPresent()){
            return this;
        }else{
            Stack<Node<K,V>> stack=new Stack<>();
            ILinkMap<K,V> map=new LinkedMap<>();
            while(Optional.ofNullable(temp).isPresent()){
                stack.push(temp);
                temp=temp.next;
            }
            while(0<stack.size()){
                Node<K, V> pop = stack.pop();
                map.put(pop.key,pop.value);
            }
            return map;
        }
    }
    //检查key是否相等
    private Boolean checkIfEqual(K k,K k1){
        if(k==k1){
            return true;
        }else if(k.equals(k1)){
            return true;
        }
        return false;
    }
}
