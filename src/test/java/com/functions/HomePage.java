package com.functions;

import org.testng.annotations.Test;

public class HomePage {

    @Test
    public void logIn(){
        System.out.println("Current users able to log in to the application");
    }

    @Test
    public void select_a_MenuItem(){
        System.out.println("Current users able to select an item from the menu");
    }
}
