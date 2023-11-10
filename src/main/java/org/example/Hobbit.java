package org.example;

class Hobbiti {
    String nume;
    public static void main(String[] args) {
        Hobbiti[] h = new Hobbiti[3];
        int z = -1;
        while (z<2) {
            z = z + 1;
            h[z] = new Hobbiti();
            h[z].nume ="Frodo";
            if (z == 1) {
                h[z].nume = "Yanis";
            }
            if (z == 2) {
                h[z].nume = "Nicolas";
            }
            System.out.println("My name is  " + h[z].nume);
        }
    }
}