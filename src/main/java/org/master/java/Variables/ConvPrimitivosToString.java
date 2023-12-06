package org.master.java.Variables;

public class ConvPrimitivosToString {
    public static void main(String[] args) {
        // int a String
        int noint = 234;
        var text = Integer.toString(noint);
        System.out.println("text = " + text);
        
        // Double a String
        var noDo = 123.56e2;
        var strDouble = Double.toString(noDo);
        System.out.println("strDouble = " + strDouble);
        var strDouble2 = String.valueOf(noDo);
        System.out.println("strDouble2 = " + strDouble2);
        
        var noFloat = 234.565f;
        System.out.println("noFloat = " + noFloat);
        var strFloat = Float.toString(noFloat);
        System.out.println("strFloat = " + strFloat);
        
        // boolean
        var isTrue = true;
        System.out.println("isTrue = " + isTrue);
        var strBoolean = String.valueOf(isTrue);
        System.out.println("strBoolean = " + strBoolean);
        var str2 = Boolean.toString(isTrue);
        System.out.println("str2 = " + str2);


    }
}
