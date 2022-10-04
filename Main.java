package com.company.java_core.homework17.task1;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {9,33,-12,4,9,10,72,-1,6,-55};

        Collection collection = new Collection(array);
        Iterator iteratorInside = collection.createInside();

        while(iteratorInside.hasNext()) {
            System.out.println(iteratorInside.next());
        }
        System.out.println();


        Iterator iteratorOutside = collection.createOutside();

        while(iteratorOutside.hasNext()) {
            System.out.println(iteratorOutside.next());
        }

    }
}
