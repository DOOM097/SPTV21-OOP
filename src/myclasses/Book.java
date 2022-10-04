package myclasses;
import java.util.Arrays;
public class Book {
    private Author[] authors;
    private String caption;
    

    public Book() {
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Override
    public String toString() {
        return "Book{" 
                + "authors=" + Arrays.toString(authors)
                + ", caption=" + caption 
                + '}';
    }
    
    
}
