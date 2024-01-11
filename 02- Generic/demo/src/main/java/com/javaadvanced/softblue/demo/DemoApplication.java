package com.javaadvanced.softblue.demo;

import com.javaadvanced.softblue.demo.Map.Map;

public class DemoApplication {

    public static void main(String[] args) {

        Map<Integer, String> map = new Map<>();

        System.out.println(map.put(10, "Gabriel"));
        System.out.println(map.put(20,"Robert"));

        System.out.println(map.get(10));

        System.out.println(map.put(20,"Rodrigo"));

        map.clear();

        System.out.println(map.get(20));

    }

}
