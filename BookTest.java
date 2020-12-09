package com.company;

public class BookTest {
    public static void main(String[] args){
        Book one= new Book();
        one.setYear(1869);
        one.setTitle("War and Peace");
        one.setAuthor("Leo Tolstoy");
        System.out.print("Название и автор книги: "+one.getTitle()+" " +one.getAuthor()+" Дата: "+one.getYear());
    }
}
