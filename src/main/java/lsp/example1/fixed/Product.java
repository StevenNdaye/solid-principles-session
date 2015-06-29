package lsp.example1.fixed;

public class Product {
    private String name;
    private String author;

    public Product(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
