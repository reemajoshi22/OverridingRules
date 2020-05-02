package com.learning.rules.sameSignatureRule;

class Horse extends Animal {

    @Override
    public void eat() {
        System.out.println("Horse eating hay, oats, "
                + "and horse treats");
    }

    /**
     * below method is not an example of method overriding as it doesnot have same signature
     */
    //@Override // cannot mark it as over ridden as does not have same signature
    public void eat(String s) {
        System.out.println("Horse eating hay, oats, "
                + "and horse treats");
    }
}