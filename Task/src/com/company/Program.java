package com.company;

public class Program {
    public static void main(String[] args)
    {
        Thread tread = new Thread(new Runnable() {
        public void run()
        {
            System.out.println("Привет из побочного потока!");
        }
    });
        tread.start();				//Запуск потока

        System.out.println("Главный поток завершён...");
    }
}
