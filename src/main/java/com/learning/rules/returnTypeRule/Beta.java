package com.learning.rules.returnTypeRule;

class Beta extends Alpha {
 Beta doStuff(int i) { // legal override in Java 1.5
  System.out.println("Beta Class");
  return new Beta();
 }
}