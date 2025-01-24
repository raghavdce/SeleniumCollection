package com.selenium.javapractice;


class Animal { 
    public void makeSound() 
    { 
        System.out.println("The animal makes a sound"); 
    } 
} 
class Dog extends Animal { 
    public void makeSound() 
    { 
        System.out.println("The dog barks"); 
    } 
  
    public void fetch() 
    { 
        System.out.println("The dog fetches a ball"); 
    } 
} 
class TypeCasting { 
    public static void main(String[] args) 
    { // Upcasting 
        Animal animal = new Dog(); 
        // Calls the overridden method in Dog class 
        animal.makeSound(); 
        // This would give a compile error as fetch() is not 
        // a method in Animal class 
        //animal.fetch(); 
    } 
}