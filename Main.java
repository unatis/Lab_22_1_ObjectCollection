package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashSet<Monkey> Monkeys = new HashSet<Monkey>();

        Monkey m1 = new Monkey();
        m1.MonkeyName = "Monkey 1";
        m1.MonkeyType = "gorilla";

        Monkeys.add(m1);

        Monkey m2 = new Monkey();
        m2.MonkeyName = "Monkey 2";
        m2.MonkeyType = "baboon";

        Monkeys.add(m2);

        for(Monkey tmp : Monkeys){

            System.out.println(tmp.MonkeyName + " " + tmp.MonkeyType);

        }


    }

}
