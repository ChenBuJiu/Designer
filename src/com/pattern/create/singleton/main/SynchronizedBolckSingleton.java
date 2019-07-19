package com.pattern.create.singleton.main;

/**
 * @author evans
 * @create 2019-05-31 2019/5/31
 * -- 不推荐 性能不好
 **/
public class SynchronizedBolckSingleton {
    private static SynchronizedBolckSingleton synchronizedBolckSingleton;
    private SynchronizedBolckSingleton(){}
    public static SynchronizedBolckSingleton getSingleton(){
        if(null == synchronizedBolckSingleton){
            synchronized (SynchronizedBolckSingleton.class){
                synchronizedBolckSingleton = new SynchronizedBolckSingleton();
            }
        }
        return synchronizedBolckSingleton;
    }
}
