package com.marianbastiurea.c06challenges;

 class ParentSuper {

        protected int num = 1;

        ParentSuper(){
            System.out.println("Parent class default constructor.");
        }

        ParentSuper(String x){
            System.out.println("Parent class parameterised constructor.");
        }

        public void foo(){
            System.out.println("Parent class foo!");
        }
    }

    class Child extends ParentSuper{
        private int num = 2;

        Child(){

            super("Call Parent");
            System.out.println("Child class default Constructor");
        }

        void printNum(){
            System.out.println(num);
            System.out.println(super.num);
        }

        @Override
        public void foo(){
            System.out.println("Child class foo!");
            super.foo();
        }



        public static void main(String args[]) {
            Child demoObject=new Child();
            demoObject.foo();
        }
}
