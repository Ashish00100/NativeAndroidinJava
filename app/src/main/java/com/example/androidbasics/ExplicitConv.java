package com.example.androidbasics;

public class ExplicitConv {
        public static void main(String[] args) {
            // int to double
            int intValue = 10;
            double doubleValue = (double) intValue;
            System.out.println("int to double: " + doubleValue);

            // double to float
            double doubleVal = 12.345;
            float floatVal = (float) doubleVal;
            System.out.println("double to float: " + floatVal);

            // long to int
            long longValue = 12345L;
            int intValueFromLong = (int) longValue;
            System.out.println("long to int: " + intValueFromLong);

            // long to short
            long longVal = 98765L;
            short shortVal = (short) longVal;
            System.out.println("long to short: " + shortVal);

            // char to String
            char charValue = 'A';
            String stringValue = Character.toString(charValue);
            System.out.println("char to String: " + stringValue);

            // char to int
            int intValueFromChar = (int) charValue;
            System.out.println("char to int: " + intValueFromChar);

            // char to double
            double doubleValueFromChar = (double) charValue;
            System.out.println("char to double: " + doubleValueFromChar);

            // float to int
            float floatValue = 45.67f;
            int intValueFromFloat = (int) floatValue;
            System.out.println("float to int: " + intValueFromFloat);

            // float to char
            char charValueFromFloat = (char) floatValue;
            System.out.println("float to char: " + charValueFromFloat);
        }
}
