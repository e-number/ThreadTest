package com.company;


interface Executable {
    int execute(int x);
}

class Runner {
    public void run(Executable e) {
        int a = e.execute(10);
        System.out.println(a);
    }
}

public class LambdaExpression {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute(int x) {
                System.out.println("Hello");

                return x + 5;
            }
        });

        runner.run(x -> x + 5);
    }
}
