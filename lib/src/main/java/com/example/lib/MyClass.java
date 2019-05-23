package com.example.lib;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {


    public static void main(String[] args){
        String regExp = "(\\d+).*";
        Pattern p = Pattern.compile(regExp);
        String model="32sdfdsf";
        Matcher m = p.matcher(model);
        System.out.println(m.matches());
        System.out.println(m.group(1));

    }
}
