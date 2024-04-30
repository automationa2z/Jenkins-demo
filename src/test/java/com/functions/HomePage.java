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

    @Test
    public void add_item_in_bucket(){
        System.out.println("Adding item in a bucket");
    }

    @Test
    public void checkout_Items_in_bucket(){
        System.out.println("Checking out items in the bucket");
    }

    @Test
    public void verify_bucket_is_empty(){
        System.out.println("After checkout bucket is empty.");
    }
}
