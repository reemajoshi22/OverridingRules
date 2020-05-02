package com.learning.rules.exceptionsRule;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class Horse extends Animal {

    /*@Override
    public void eat() {
        System.out.println("Horse eating hay, oats, "
                + "and horse treats");
    }*/

    /**
     * below method is not an example of method overriding as it throws a checked exception and in super class it does not throws
     */
   /* public void eat() throws SQLException {
        System.out.println("Horse eating hay, oats, "
                + "and horse treats");
    }*/

    /**
     *
     * Below method throws FileNotFoundException which is a subtype of IOException
     */
    @Override
    void method() throws FileNotFoundException {
        System.out.println("Sub Class");
    }
}