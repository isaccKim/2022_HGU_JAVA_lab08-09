package edu.handong.csee.java.inheritance;


public class Cat extends Animal {
	
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    @Override
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;  //polymorphism
        Animal.testClassMethod(); // hiding
        myAnimal.testInstanceMethod(); //overriding
        
        Dog myDog = new Dog();
        Animal myAnimal2 = myDog; //polymorphism
        Animal.testClassMethod(); // hiding
        myAnimal2.testInstanceMethod(); // overriding
        
        Monkey myMonkey = new Monkey();
        Animal myAnimal3 =  myMonkey;  //polymorphism
        Animal.testClassMethod(); // hiding
        myAnimal3.testInstanceMethod(); // overriding
     
    }
}

