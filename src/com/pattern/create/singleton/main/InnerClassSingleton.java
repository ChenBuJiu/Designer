package com.pattern.create.singleton.main;

/**
 * @author evans
 * @create 2019-05-31 2019/5/31
 * --
 **/
public class InnerClassSingleton {
    private InnerClassSingleton(){}
    private static class Singleton{
        public static InnerClassSingleton innerClassSingleton = new InnerClassSingleton();
    }
    public static InnerClassSingleton getSingleton(){
        return Singleton.innerClassSingleton;
    }
}
