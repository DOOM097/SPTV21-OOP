package sptv21oop;

import myclasses.Author;
import myclasses.Book;

public class SPTV21OOP {
    public static void main(String[] args) {
        Author author1= new Author();
        author1.setFirstname("Aleksandr");
        author1.setLastname("Pushkin");
        Book book1=new Book();
        book1.setCaption("Yevhenii Onegin");
        Author[] authors = new Author[1];
        authors[0]= author1;
        book1.setAuthors(authors);
        System.out.println(book1.toString());
        
    }
    
}
