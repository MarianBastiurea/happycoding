package com.marianbastiurea.c08threads.firstChallenge;

public class MainThreads {

    public static void main(String[] args) {

        FirstThread firstThread = new FirstThread();
        SecondThread secondRunnable = new SecondThread();
        Thread secondThread= new Thread(secondRunnable);
        firstThread.start();
        secondThread.start();

        try {
            Thread.sleep(2000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        secondThread.interrupt();
    }
}

