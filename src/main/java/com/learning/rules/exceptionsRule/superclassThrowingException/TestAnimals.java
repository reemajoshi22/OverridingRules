package com.learning.rules.exceptionsRule.superclassThrowingException;

import java.io.IOException;

/**
 * Rule : If a method is overridden but you use a polymorphic (supertype)
 * reference to refer to the subtype object with the overriding method, the compiler
 * assumes you're calling the supertype version of the method. If the supertype version
 * declares a checked exception, but the overriding subtype method does not, the compiler
 * still thinks you are calling a method that declares an exception
 */
public class TestAnimals {
 public static void main (String [] args) {

  Animal a = new Horse();
  Horse d = new Horse();
  d.eat(); // ok
  // a.eat(); // compiler error -
  // unreported exception


  /*The above code will not compile because of the Exception declared on the Animal eat()
  method. This happens even though, at runtime, the eat() method used would be the Dog
  version, which does not declare the exception.*/
 }
}