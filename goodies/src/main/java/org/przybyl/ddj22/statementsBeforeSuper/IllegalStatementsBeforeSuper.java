package org.przybyl.ddj22.statementsBeforeSuper;


public class IllegalStatementsBeforeSuper extends AnotherBaseClass {

    String b = "default";

    public static void main() {
        new IllegalStatementsBeforeSuper(42);
    }

    IllegalStatementsBeforeSuper(int number) {
//        this.b = "illegal";
//        this(this.instanceMethod());

//        if (Math.random() < 0.5) {
//            this("glass is empty");
//        } else {
//            this("glass is full");
//        }
        this("is legal");
    }

    IllegalStatementsBeforeSuper(String a) {
//        super.a = "illegal";
        super();
    }

    String instanceMethod() {
        return "result";
    }
}


class AnotherBaseClass {
    String a;

    public AnotherBaseClass() {
        System.out.println("Another base class constructor called");
    }
}
