package com;

import java.util.*;

/**
 * @author evans
 * @create 2019-06-10 2019/6/10
 * --
 **/
public class CompareTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        System.out.println(time);
        calendar.add(Calendar.HOUR, 1);
        Date time1 = calendar.getTime();
        System.out.println(time1);
        System.out.println(time.compareTo(time1));
        List<Date> list = new ArrayList<>();
        list.add(time);
        list.add(time1);
        Collections.sort(list, new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                return o2.compareTo(o1);
            }
        });
        for (Date date : list){
            System.out.println(date);
        }
    }
}
