package ocp.example2.fixed;

public enum ProductColor {
    RED("red"), BLUE("blue"), GREEN("green"), BLACK("black");

    private String value;

    private ProductColor(String value) {
        this.value = value;
    }

    public String getColor(){
        return value;
    }
}
