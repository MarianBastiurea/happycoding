package org.example;


    class Caine {
        String nume;

        public static void main(String[] args) {
            Caine caine1 = new Caine();
            caine1.latra();
            caine1.nume = "Bart";
            Caine[] cainiiMei = new Caine[3];
            cainiiMei[0] = new Caine();
            cainiiMei[1] = new Caine();
            cainiiMei[2] = caine1;
            cainiiMei[0].nume = "Fred";
            cainiiMei[1].nume = "Marge";
            System.out.print("Numele ultimului caine este ");
            System.out.println(cainiiMei[2].nume);
            int x = 0;
            while (x < cainiiMei.length) {
                cainiiMei[x].latra();
                x = x + 1;
            }
        }

            public void latra() {
                System.out.println(nume + " says Ham");
            }

            public void mananca() {
    System.out.println (" eat ");
            }

            public void aleargaPisica() {
        System.out.println (" run after cat");
            }

        }
