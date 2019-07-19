package com.pattern.create.singleton.main;

/**
 * @author evans
 * @create 2019-05-31 2019/5/31
 * volatile 禁止重排序
 **/
public class DoubleCheckSingleton {
    private static volatile  DoubleCheckSingleton doubleCheckSingleton;
    private DoubleCheckSingleton(){}
    public static DoubleCheckSingleton getSingleton(){
        if (null == doubleCheckSingleton){
            synchronized (DoubleCheckSingleton.class){
                if(null == doubleCheckSingleton){
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
