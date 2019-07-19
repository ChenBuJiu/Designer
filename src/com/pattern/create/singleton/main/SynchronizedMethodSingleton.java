package com.pattern.create.singleton.main;

/**
 * @author evans
 * @create 2019-05-31 2019/5/31
 * -- 可能产生多个实例
 **/
public class SynchronizedMethodSingleton {
    private static SynchronizedMethodSingleton synchronizedMethodSingleton;
    private SynchronizedMethodSingleton(){}
    public static SynchronizedMethodSingleton getSingleton(){
        if(null == synchronizedMethodSingleton){
            synchronizedMethodSingleton = new SynchronizedMethodSingleton();
        }
        return synchronizedMethodSingleton;
    }
}
