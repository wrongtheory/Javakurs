package wbs.util;

import java.util.HashSet;

import java.util.Set;

import java.util.TreeSet;

 

public class C46 {

 

            public static void main(String[] args) {

                        double d1 = Math.random();

                        double d2 = Math.random();

                        Set<CharSequence> set = d1 < 0.1 ? new HashSet<>()

                                : new TreeSet<CharSequence>();

                        set.add(d2 < 0.1 ? "aha" : "nana");

                        set.add(d2 < 0.1 ? "bebe" : "gaga");

                        System.out.println(set);

            }

}