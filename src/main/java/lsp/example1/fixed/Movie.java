package lsp.example1.fixed;

public class Movie extends Product {
    public Movie(String name, String author) {
        super(name, author);
    }

    public String getAuthor() {
        return "No author but an actor somewhere";
    }
}
