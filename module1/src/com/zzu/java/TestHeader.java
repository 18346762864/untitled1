package com.zzu.java;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Eve
 * @Date 2020/9/24 - 9:21
 */
public class TestHeader {

    public static void main(String[] args) {

        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TestHeader.main");
        ArrayList list = new ArrayList();


        ArrayList list2 = new ArrayList();

        System.out.println(list);

        list.add(0, 123);
        for (int i = 0; i < 10; i++) {

        }
        if (list2 == null) {
            for (int i = 0; i < 10; i++) {
                if (args != null) {

                }
            }
        }


        int num=1;
        int num2=2;
        System.out.println("num = " + num);
        System.out.println("num = " + num);

        String[] arr= new String[]{"牛魔王","孙悟空","唐僧","猪八戒",};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println("iter增强for循环=========="+s);
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("itar========"+s);
        }


        ArrayList<Object> objects = new ArrayList<>();
        objects.add(123);
        objects.add(456);
        objects.add(789);
        for (Object object : objects) {
            System.out.println(object);
        }


    }

}






