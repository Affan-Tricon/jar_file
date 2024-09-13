package com.tricon.training;
import com.tricon.training.Add.add;
import com.tricon.training.Sub.sub;
import com.tricon.training.Mul.mul;
import com.tricon.training.Div.div;
public class Main {
    public static void main(String[] args) {
        add a = new add();
        sub s = new sub();
        mul m = new mul();
        div d = new div();
        int x = 56;
        int y = 9;
        System.out.println("Addition: " + a.add(x, y));
        System.out.println("Subtraction: " + s.sub(x, y));
        System.out.println("Multiplication: " + m.mul(x, y));
        System.out.println("Division: " + d.div(x, y));
    }
}