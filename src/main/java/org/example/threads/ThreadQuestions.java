package org.example.threads;

public class ThreadQuestions{
    public static void main(String[] args){
        Thread t1 = new count();
        t1.start();
        Thread t2 = new count();
        t2.start();
    }
}
