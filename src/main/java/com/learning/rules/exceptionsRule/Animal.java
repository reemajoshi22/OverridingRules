package com.learning.rules.exceptionsRule;

import java.io.IOException;
import java.sql.SQLException;

public class Animal {
    public void eat()  {
        System.out.println("Generic Animal Eating Generically");
    }

    // IOException is of type Checked Exception
    void method() throws IOException {
        System.out.println("Super Class");
    }
}
