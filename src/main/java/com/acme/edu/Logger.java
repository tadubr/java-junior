package com.acme.edu;

public class Logger {
    private static int integerChainSum;
    public  static void flushIntegerBuffer(){
        output("primitive: "  + integerChainSum);
        integerChainSum = 0;
    }
    public static void log(int message) {
        integerChainSum = integerChainSum + message;

    }

    public static void log(byte message) {
        flushIntegerBuffer();
        output("primitive: " + message);
    }



    public static void log(char message) {
        flushIntegerBuffer();
        output("char: " + message);
    }

    public static void log(String message) {
        flushIntegerBuffer();
        output("string: " + message);
    }

    public static void log(boolean message) {
       flushIntegerBuffer();
        output("primitive: " + message);
    }

    public static void log(Object message) {
        flushIntegerBuffer();
        output("reference: " + message);
    }

    //region implementation
    private static void output(String decoratedMessage) {
        System.out.println(decoratedMessage);
    }
    //endregion
}
