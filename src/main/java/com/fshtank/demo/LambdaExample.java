package com.fshtank.demo;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {

    /* Example pattern: https://www.w3schools.com/java/java_lambda.asp */

    public void callMe () {
        System.out.println("/r/n/r/n**** Lambda Example ****/r/n/r/n");

        String s = "hello";
            String exclaim =  s + "!";
            String ask = s + "?";
            List<String> list = Arrays.asList(exclaim, ask);

            list.forEach((i)-> { System.out.println("Hello "+ i); });

    }

}
