package com.learning.rules.accessModifierRule;


/**
 * Rule : The access level can't be more restrictive than that of the overridden method.
 */
public class TestAnimals {
 public static void main (String [] args) {
 Animal a = new Animal();
 Animal b = new Horse(); // Animal ref, but a Horse object
 a.eat(); // Runs the Animal version of eat() as a is an object of type animal
  // and in overriding it decides as runtime which method to run

 b.eat(); // Runs the Horse version of eat()
 }
}