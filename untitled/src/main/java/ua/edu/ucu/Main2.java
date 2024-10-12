package ua.edu.ucu;

import java.util.function.Predicate;

class Main2 {
    public static void main(String[] args){
        Predicate<Integer> moreThanTen = x -> x>10;

        moreThanTen = new Predicate<Integer>(){
            public boolean test(Integer t){
                return t>10;
            }
        };
        System.out.println(moreThanTen.test(10));

        TestFunctionalInterface testFunctionalInterface = str ->str.length()>10;
        System.out.println(testFunctionalInterface.testMethod("Random String"));
    }
}
