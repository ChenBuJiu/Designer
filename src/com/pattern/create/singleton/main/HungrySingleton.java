package com.pattern.create.singleton.main;

/**
 * @author evans
 * @create 2019-05-31 2019/5/31
 *  安全，性能不行
 **/
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getSingleton(){
        return hungrySingleton;
    }
}
