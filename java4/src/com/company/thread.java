package com.company;

class MyThread extends Thread{
    public void run(){
        for(int i = 1; i < 6; i++){
            System.out.println(i);
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

public class thread {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        obj.start();

        MyThread obj2 = new MyThread();
        obj2.start();
    }
}
