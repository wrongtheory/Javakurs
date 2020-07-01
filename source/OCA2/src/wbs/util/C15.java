package wbs.util;

import java.util.NavigableSet;

import java.util.Random;

import java.util.TreeSet;

 

public class C15 {

 

            public static void main(String[] args) {

                        Random random = new Random();

                        NavigableSet<Integer> set = new TreeSet<>();

                        int z1 = random.nextInt(10);

                        int z2 = random.nextInt(10);

                        while (set.size() < 5) {

                                    set.add(random.nextInt(10));

                        }

                        set.subSet(z1, z2).remove(0);

            }

}