package com.marianbastiurea.c08threads.firstChallenge;

class SecondThread implements Runnable {

    @Override
            public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("even number " + i+" ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
