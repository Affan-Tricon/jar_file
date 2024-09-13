package com.tricon.training.Div;

public class div {
    public int div(int a, int b) {
        try{
            return a/b;
        }
        catch(Exception e){
            throw new ArithmeticException();
        }
    }
}