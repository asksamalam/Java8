package org.example.threads;

public class count extends Thread{
    private Integer val = 0;
    public synchronized void run(){
        do{
            System.out.println(Thread.currentThread().getName() +" "+ val++);

        }while (val<=100);
    }
}
