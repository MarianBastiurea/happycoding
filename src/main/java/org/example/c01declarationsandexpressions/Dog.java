package org.example.c01declarationsandexpressions;


class Dog {
    String nume;

    public static void main(String[] args) {
        Dog[] MyDogs = new Dog[3];
        MyDogs[0] = new Dog();
        MyDogs[1] = new Dog();
        MyDogs[2] = new Dog();
        MyDogs[0].nume = "Fred";
        MyDogs[1].nume = "Marge";
        MyDogs[2].nume = "Bart";
        int x = 0;
        while (x < MyDogs.length) {
            MyDogs[x].bark();
            MyDogs[x].eat();
            MyDogs[x].runAfterCat();
            x = x + 1;
            System.out.println();
        }
    }

    public void bark() {
        System.out.print(nume + " says Ham and");
    }

    public void eat() {
        System.out.print(" eat hot dog and ");
    }

    public void runAfterCat() {
        System.out.print(" run after cat");
    }

}
