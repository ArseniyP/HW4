package com.phoenix;

public class Reader {
    private String studName;
    private int number;
    private String facultet;
    private long phoneNum;

    Reader() throws Exception{
        throw new Exception("Конструктор Reader по умол не предусмотрен");
    }

    Reader(String studName, int studNum, String facultet, long phoneNum) throws Exception{
        if(studNum < 0)
            throw new Exception("Номер читательского билета указан не верно");
        this.studName = studName;
        this.number = studNum;
        this.phoneNum = phoneNum;
        this.facultet = facultet;
    }

    public void takeBook(int numberBook){
        System.out.printf("%s взял %d книг\n", studName, numberBook);
    }

    public void takeBook(String...books){
        System.out.print(studName + " взял книги:");
        for(String bookName : books)
            System.out.printf(" %s |", bookName);
        System.out.println("");
    }

    public void takeBook(Book...books){
        System.out.print(studName + " взял книги:");
        for(Book book : books)
            System.out.printf(" %s |", book.getName());
        System.out.println("");
    }

    public void returnBook(int numberBook){
        System.out.printf("%s вернул %d книг\n", studName, numberBook);
    }

    public void returnBook(String...books){
        System.out.print(studName + " вернул книги:");
        for(String bookName : books)
            System.out.print(" " + bookName);
        System.out.println("");
    }

    public void returnBook(Book...books){
        System.out.print(studName + " вернул книги:");
        for(Book book : books)
            System.out.print(" " + book.getName());
        System.out.println("");
    }
}
