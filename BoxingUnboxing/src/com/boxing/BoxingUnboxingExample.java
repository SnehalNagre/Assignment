package com.boxing;

public class BoxingUnboxingExample {
    public static void main(String[] args) {
        // for byte
        byte b = 10;
        Byte boxedByte = b;
        byte unboxedByte = boxedByte;

        // for short
        short s = 20;
        Short boxedShort = s;
        short unboxedShort = boxedShort;

        // for int
        int i = 30;
        Integer boxedInt = i;
        int unboxedInt = boxedInt;

        // for long
        long l = 40L;
        Long boxedLong = l;
        long unboxedLong = boxedLong;

        // Boxing and unboxing for float
        float f = 50.0f;
        Float boxedFloat = f;
        float unboxedFloat = boxedFloat;

        // for double
        double d = 60.0;
        Double boxedDouble = d;
        double unboxedDouble = boxedDouble;

        // for char
        char c = 'a';
        Character boxedChar = c;
        char unboxedChar = boxedChar;

        // for boolean
        boolean bool = true;
        Boolean boxedBoolean = bool;
        boolean unboxedBoolean = boxedBoolean;
    }
}

