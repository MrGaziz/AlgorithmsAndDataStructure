package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.Stack;

public class BeelineTestTask {

    public static void main(String[] args) {
        // Cоздать стек чтобы хранить числа сгененрированные продюсерами
        Stack<Integer> stack = new Stack<>();

        // Создать 2 производителя генерирующие арифметическую прогрессию как на примере ({3,6,9,...} & {5,10,15,...})
        Producer p1 = new Producer(stack, 3, 3);
        Producer p2 = new Producer(stack, 5, 10);

        // Создать принтер
        Printer printer = new Printer(stack);

        // Создать thread pool для производителей и для принтера чтобы они работали паралельно
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Отправить производителей и принтера в thread pool
        executor.submit(p1);
        executor.submit(p2);
        executor.submit(printer);

        executor.shutdown();
    }
}

class Producer implements Runnable {
    private Stack<Integer> stack;
    private int start;
    private int increment;
    private Random random;
    List<Integer> s = new ArrayList<>();

    public Producer(Stack<Integer> stack, int start, int increment) {
        this.stack = stack;
        this.start = start;
        this.increment = increment;
        this.random = new Random();
    }

    public void run() {
        int number = start;
        while (true) {
            // random чтобы генерировать случайные промежутки времени
            int sleepTime = random.nextInt(1000) + 1000;
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Добавить число в стек затем же инкрементнуть
            stack.push(number);
            number += increment;
        }
    }
}

class Printer implements Runnable {
    private Stack<Integer> stack;
    private Random random;

    public Printer(Stack<Integer> stack) {
        this.stack = stack;
        this.random = new Random();
    }

    public void run() {
        while (true) {
            // random чтобы генерировать случайные промежутки окон
            int sleepTime = random.nextInt(1000) + 1000;
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
//          Если стек пустой то ждать следующего окна для дальнейшей печати
            if (!stack.empty()) {
                // Выводить числа из стека в порядке LIFO
                System.out.println(stack.pop());
            }
        }
    }
}
