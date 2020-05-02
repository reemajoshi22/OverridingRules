package com.learning.rules.exceptionsRule;

import java.io.IOException;

/**
 * Rule :The overriding method CAN throw any unchecked (runtime) exception,
 * regardless of whether the overridden method declares the exception. (More
 * in Chapter 6.)
 * ■ The overriding method must NOT throw checked exceptions that are new
 * or broader than those declared by the overridden method. For example, a
 * method that declares a FileNotFoundException cannot be overridden by
 * a method that declares a SQLException, Exception, or any other non runtime exception
 * unless it's a subclass of FileNotFoundException
 *
 * The overriding method can throw narrower or fewer exceptions. Just because
 * an overridden method "takes risks" doesn't mean that the overriding subclass'
 * exception takes the same risks. Bottom line: An overriding method doesn't
 * have to declare any exceptions that it will never throw, regardless of what the
 * overridden method declares
 */
public class TestAnimals {
 public static void main (String [] args) {
 Animal a = new Animal();
 Animal b = new Horse(); // Animal ref, but a Horse object
 a.eat(); // Runs the Animal version of eat() as a is an object of type animal
  // and in overriding it decides as runtime which method to run

 b.eat(); // Runs the Horse version of eat()

  try {
   a.method();
   b.method();

  } catch (IOException e) {
   e.printStackTrace();
  }
 }
}