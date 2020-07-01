package wbs.util;

import java.util.HashMap;

import java.util.Map;

import java.util.TreeMap;

 

public class C12 {

 

     public static void main(String[] args) {

          Map<String, String> map = Math.random() > 0.1

                     ? new HashMap<String,String>()

                     : new TreeMap<String,String>();

          map.put(null, "blabla");

     }

}