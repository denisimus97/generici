package com.company;

class Mass {

    public <T> void vivod(T[] items) {
        for (int i = 0; i<items.length; i++) {
            System.out.println(i + ": " + items[i]);
       // for (T item : items) {
          //  System.out.println(item);
        }

        }
        public static <T> void change(T[] ite,int first,int second){
        T elem;
        elem = ite[first];
        ite[first] = ite[second];
        ite[second] = elem;
           // for (int i = 0; i<ite.length; i++)
            System.out.println( "теперь "+first+ " элемент- "+ ite[first]);
            System.out.println("теперь "+ second+ " элемент- "+ ite[second]);
        }
    public <T> void reverse(T[]it) {
        for (int i = it.length - 1; i >= 0; --i) {
            System.out.println(i + ": " + it[i]);
        }
    }

        }
























   // public Univer(int numOfStudents) {
        //this.gruppaStudents = new Student[numOfStudents];
        //for (int i = 0; i < numOfStudents; i++) {
        //    this.gruppaStudents[i] = new Student("Stud " + (i + 1), randomKursGenerator());
         //   this.prepodovatel01.cgangeReitingStudents(this.gruppaStudents[i]);