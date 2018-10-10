package com.company;

public class Main {
    public  static void main(String[] args){

        Product p = new Product();
        p.setPrice(9.99);
        p.setCode("tytyuy");
        p.setDescription("yonas");
        System.out.println(p.toString());

        Book b= new Book();
        b.setPrice(50.99);
        b.setAuthor("mohamed");
        b.setPages(350);
        b.setCode("uiuiu");
        b.setDescription("malt");
        System.out.println(b.toString());


    }
}
