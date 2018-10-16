package com.company;

public class Main {


    public static void main(String[] args) {

        Mass kombinim = new Mass();
        String[] cats = {"Seri Cot", "Beli coskka", "Cherni cot", "Lisi cot", "Big cot", "Fat cot"};
        Integer[] numbers = {1,7,12,19,54,71};
        kombinim.<String>vivod(cats);
        kombinim.<String>change(cats,2,3);
        kombinim.<String>reverse(cats);
        kombinim.<Integer>vivod(numbers);
        kombinim.<Integer>change(numbers,1,2);
        kombinim.<Integer>reverse(numbers);
    }
}





