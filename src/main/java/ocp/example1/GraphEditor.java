package ocp.example1;

public class GraphEditor {

    public void drawShape(Shape shape){
        if(shape.type == 1) {
            drawRectangle((Rectangle) shape);
        } else if(shape.type == 2){
            drawCircle((Circle) shape);
        }
    }

    public void  drawRectangle(Rectangle rectangle){

    }

    public void drawCircle(Circle circle){

    }
}
