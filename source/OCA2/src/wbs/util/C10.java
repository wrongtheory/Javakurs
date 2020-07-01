package wbs.util;

import java.util.HashSet;

import java.util.Set;

import java.util.TreeSet;

 

public class C10 {

 

     public static void main(String[] args) {

          Set<String> set = Math.random() > 0.01 ?

                     new HashSet<String>()

                     : new TreeSet<String>();

          set.add(null);

     }

}