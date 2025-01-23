package com.modelClass;

public class Animal {
    abstract class animal {
        private String name;
        private int age;

        public animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        // Abstract method to be used by subclasses
        public abstract String sound();
    }
    class Dog extends animal {
        public Dog(String name, int age) {
            super(name, age);
        }

        @Override
        public String sound() {
            return "Bark";
        }
    }
    class Cat extends animal {
        public Cat(String name, int age) {
            super(name, age);
        }

        @Override
        public String sound() {
            return "Meow";
        }
    }
}
