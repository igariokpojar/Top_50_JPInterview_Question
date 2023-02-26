package Interview;

public class Inheritance {

    public static void main(String[] args) {


        class Animal {
            String color;
        }

        class Cat extends Animal {
            void meow() {

            }
        }
        System.out.println("Meow");
    }
}

/*
    The following example code shows how to use the extends keyword to create a subclass of the class Animal.
     The new class Cat inherits the variable from the Animal class and adds more code that only belongs to the Cat class.
     */