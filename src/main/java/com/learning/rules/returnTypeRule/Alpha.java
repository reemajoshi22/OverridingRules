package com.learning.rules.returnTypeRule;

class Alpha {
 Alpha doStuff(int i) {
  System.out.println("Alpha class");
 return new Alpha();
 }
}