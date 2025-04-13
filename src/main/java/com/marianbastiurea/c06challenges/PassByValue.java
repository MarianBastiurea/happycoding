package com.marianbastiurea.c06challenges;

public class PassByValue {
    private PassByValue() {
    }

    static class Person {
        String name;
    }

    public static class PassByTest {

        // Metodă care încearcă să schimbe valoarea unui int
        public static void changePrimitive(int number) {
            number = 100;
        }

        // Metodă care schimbă câmpul unui obiect
        public static void changeObject(Person p) {
            p.name = "Alice";
        }

        // Metodă care schimbă referința obiectului
        public static void reassignObject(Person p) {
            p = new Person();  // referință nouă
            p.name = "Charlie";
        }

        public static void main(String[] args) {
            int myNumber = 50;
            changePrimitive(myNumber);
            System.out.println("Primitive after method: " + myNumber); // 50

            Person person1 = new Person();
            person1.name = "Bob";

            changeObject(person1);
            System.out.println("Person name after changeObject: " + person1.name); // Alice

            reassignObject(person1);
            System.out.println("Person name after reassignObject: " + person1.name); // Alice (nu Charlie!)
        }
    }

}
