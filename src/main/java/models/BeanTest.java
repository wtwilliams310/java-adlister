package models;


import java.util.ArrayList;
import java.util.Arrays;

public class BeanTest {
    public static void main(String[] args) {
        Album album1 = new Album("Milli Vanilli", "Blame it one the Rain", 1992, 27.1, "pop");
        Album album2 = new Album("Run-DMC", "Tough as Leather", 1988, 37.1, "rap");

        Author author1 = new Author(1, "Carl", "Sagan");
        Author author2 = new Author(2, "John", "Steinbeck");

        ArrayList<Author> authors = new ArrayList<>(Arrays.asList(author1, author2));

        Quote quotes1 = new Quote("I'll be back.", author2);
        Quote quotes2 = new Quote("I wont be back.", author1);

        ArrayList<Quote> quotes = new ArrayList<>(Arrays.asList(quotes1, quotes2));

        for(Quote quote : quotes){
//            Author quoteAuthor = null;
//            for(Author author : authors){
//                if(quote.getAuthor_id() == author.getId()) {
//                    quoteAuthor = author;
//                }
//            }
            System.out.println(quote.getAuthor().getFirst_name() + " " + quote.getAuthor().getLast_name() + " says " + quote.getContent());
        }
    }
}
