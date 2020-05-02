package com.learning.rules.returnTypeRule;

/**
 * As of Java 5, you're allowed to change the return type in the
 * overriding method as long as the new return type is a subtype of the declared return
 * type of the overridden (superclass) method.
 */
public class TestCoVariantReturnTypes {
    public static void main(String[] args) {
        Alpha a=new Beta();
        Beta b=new Beta();
        a.doStuff(2);
        b.doStuff(2);

    }
}
