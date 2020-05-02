package com.learning.rules.accessModifierRule;

class Horse extends Animal {

    /**
     * correct implementation of overriding as method in super class is protected
     */
   /* @Override
    protected void eat() {
        System.out.println("Horse eating hay, oats, "
                + "and horse treats");
    }*/

    /**
     * below method is not an example of method overriding as it does not have same signature
     */

    /*@Override // cannot mark it as over ridden as you cannot narrow the access in subclass
    private void eat() {
        System.out.println("Horse eating hay, oats, "
                + "and horse treats");
    }*/

    @Override // can be marked as overriding as we are not narrowing the access in sub class
    public void eat() {
        System.out.println("Horse eating hay, oats, "
                + "and horse treats");
    }
}