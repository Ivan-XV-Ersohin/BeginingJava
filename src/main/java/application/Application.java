package application;

import hello.Hello;

public class Application {
    public static void main(String[] args){
        Hello greetingUnit = new Hello(null);
        greetingUnit.print(args[args.length - 1]);
    }
}
