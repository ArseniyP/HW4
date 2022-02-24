package com.phoenix;

public class Recursion {
    private int a, b;

    Recursion() throws Exception {
        throw new Exception("Конструктор Recursion по умол. не предусмотрен");
    }

    public Recursion(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void start() {
        System.out.printf("A = %d B = %d\n", a, b);
        recursion(a, b);
    }

        private void recursion(int a, int b) {
        if(a == b) {
            System.out.print(a + "\n\n");
            return;
        }
        else if(a > b){
            System.out.printf("%d ", a);
            this.recursion(--a, b);
        }
        else if(a < b){
            System.out.printf("%d ", a);
            this.recursion(++a, b);
        }
    }
}
