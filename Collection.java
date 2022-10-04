package com.company.java_core.homework17.task1;

public class Collection {
    private static Object[] number;

    Collection (Object [] number) {
        Collection.number = number;
    }

    public class Inside implements Iterator{

        private int count = 0;

        @Override
        public boolean hasNext() {
            return count< number.length;
        }

        @Override
        public Object next() {
            return number[count++];
        }

    }


    public Inside createInside() {
        return new Inside();
    }


    public class Outside implements Iterator{
        int count = number.length -1;

        @Override
        public boolean hasNext() {
            return count>=0;
        }

        @Override
        public Object next() {
            return number[count--];
        }
    }

    public Outside createOutside() {
        return new Outside();
    }
}
