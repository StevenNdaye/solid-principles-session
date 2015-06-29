package ocp.example2.fixed;

public enum ProductSize {
    SMALL(1), MEDIUM(2), LARGE(3), EXTRA(4);

    private int value;

    private ProductSize(int value) {
        this.value = value;
    }

    public int getSize(){
        return value;
    }
}
