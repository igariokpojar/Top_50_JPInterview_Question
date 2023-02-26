package Interview;

public class MultipleInheritance {

    interface I {
        void foo();
    }
    class A implements I {
        public void foo() {}
    }

    class B implements I {
        public void foo() {}
    }

//    class C extends A, B { // won't compile
//        public void bar() {
//            super.foo();
//        }
//    }
}
/*
The diamond problem occurs when a class inherits from multiple classes and ambiguity
occurs when it’s unclear which method to execute from which class.
 Java doesn’t allow extending multiple classes to avoid the diamond problem.
 */