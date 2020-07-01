package wbs.util;

import java.util.HashMap;

import java.util.Map;

import java.util.TreeMap;

 

public class C11 {

 

     public static void main(String[] args) {

          Map<String, String> map = Math.random() > 0.5 ?

                     new HashMap<String,String>()

                     : new TreeMap<String,String>();

          map.put("blabla", null);

     }

 

}