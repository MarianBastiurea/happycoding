package com.marianbastiurea.c08threads.firstChallenge;

public class FirstThread extends Thread {
    public FirstThread() {
    }

    public void run() {
        for(int i = 1; i <= 10; i += 2) {
            System.out.println("odd number " + i + " ");

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException var3) {
                InterruptedException e = var3;
                e.printStackTrace();
            }
        }

    }
}
