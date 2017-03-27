package wzorceprojektowe.adapter;

/**
 * Created by RENT on 2017-03-27.
 */
public class ShapeAdapter implements Shape{
    Rectangle rectangle;
    Line line;

    public ShapeAdapter(Line line) {
        this.line = line;
    }

    public ShapeAdapter(Rectangle rectangle) {

        this.rectangle = rectangle;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        if(rectangle!=null){
            rectangle.draw(x1,y1,x2,y2,x2,y2,x1,y1);
        }
        else{
            line.draw( x1, y1,  x2,  y2);
        }

    }
}
