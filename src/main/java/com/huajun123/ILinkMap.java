package com.huajun123;

public interface ILinkMap<K,V> {
    void put(K k,V v);
    void show();
    V getValue(K k);
    ILinkMap<K,V> reverseMap();
}
