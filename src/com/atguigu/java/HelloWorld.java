package com.atguigu.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HelloWorld {

    

    public static void main(String[] args) {
        System.out.println("hello world");
        ArrayList list = new ArrayList();

        Date date = new Date();

        list.add(0,123);

        System.out.println(list);

        String[] arr = new String[]{"1","2","3"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }

        List<Integer> list1 = new ArrayList<>();

        for (Integer integer : list1) {
            
        }

        for (int i = 0; i < list1.size(); i++) {
            
        }

        for (int i = list1.size() - 1; i >= 0; i--) {
            
        }

        if (list1 == null) {

        }

        if (list1 != null) {

        }

        if (list != null) {

        }

        if (list == null) {

        }

    }

    public void test(){

    }
}
