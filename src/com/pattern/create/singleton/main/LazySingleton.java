package com.pattern.create.singleton.main;

/**
 * @author evans
 * @create 2019-05-31 2019/5/31
 *  可能产生多个实例
 **/
public class LazySingleton {
    private static  LazySingleton lazySingleton;
    private LazySingleton(){}
    public static LazySingleton getSingleton(){
        if(null == lazySingleton){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
