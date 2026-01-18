package org.example;
//Coral Morales Cortes HW3


class Data<A, B, C> {
    private A _a;
    private B _b;
    private C _c;

    public Data(A a, B b, C c) {
        _a = a;
        _b = b;
        _c = c;
    }

    public <D> String concatenate(D delimiter) {
        return " " + _a + delimiter + _b + delimiter + _c;
    }

    public String concatenate() {
        return _a + " " + _b + " " + _c;
    }
}

public class Main {
    public static void main(String[] args) {

        Data pets = new Data<>("Hamster", "Dog", "Cat");
        String test1 = pets.concatenate(",");
        String test2 = pets.concatenate();
        System.out.println(test1);
        System.out.println(test2);

        Data<String, Integer, Boolean> aboutMe = new Data<>("Age", 21, true);
        String test3 = aboutMe.concatenate();
        String test4 = aboutMe.concatenate(":");
        System.out.println(test3);
        System.out.println(test4);


        Data numbers = new Data<>(22, 3.14, "32%");
        String test5 = numbers.concatenate();
        String test6 = numbers.concatenate("/");
        System.out.println(test5);
        System.out.println(test6);

        Data flag = new Data<>(true, false, true);
        String test7 = flag.concatenate();
        String test8 = flag.concatenate(" + ");
        System.out.println(test8);
        System.out.println(test7);


    }
}