package wbs.util;

import java.util.Set;

import java.util.TreeSet;

 

public class C45 {

 

            public static void main(String[] args) {

                        Set<CharSequence> set = new TreeSet<>();

                        double d1 = Math.random();

                        double d2 = Math.random();

                        set.add(d1 < 0.999 ? "aha" : new StringBuilder("aha"));

                        set.add(d2 < 0.999 ? "nana" : new StringBuilder("nana"));

                        System.out.println(set);

            }

}