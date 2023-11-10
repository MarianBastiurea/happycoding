package org.example;

class C01_p07 {
    public static void main(String[] args) {
        int a=125;
        int b=12345;
        long ax=1234567890;
        short s =4043;
        double x=2.13459;
        double dx=1.1415927;
        char c = 'W';
        long ux= 541567890;
        int a1;
        int a2;
        double a3;
        double a4;
        long a5;
        double a6;
        int a7;
        long a8;
        int a9;
        long a10;
        long a11;
        a1=Integer.valueOf(c);
        a2=a+a1;
        a3=x+a1;
        a4=dx+x;
        a5=((int)dx)+ax;
        a6=a+x;
        a7=s+b;
        a8=ax+b;
        a9=s+a1;
        a10=ax+a1;
        a11=ax+ux;
        System.out.println("a+c="+a+"+"+a1+"="+ a2);
        System.out.println("x+c="+x+"+"+a1+"="+a3);
        System.out.println("dx+x="+dx+"+"+x+"="+a4);
        System.out.println("((int)dx+ax)="+a5);
        System.out.println("a+x="+a6);
        System.out.println("s+b="+a7);
        System.out.println("ax+b="+a8);
        System.out.println("s+c="+a9);
        System.out.println("ax+c="+ax+"+"+a1+"="+a10);
        System.out.println("ax+ux="+ax+"+"+ux+"="+a11);

        }
    }
