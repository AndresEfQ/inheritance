import entities.Circle;
import entities.Rectangle;
import services.CircleService;
import services.RectangleService;

public class Main {
    public static void main(String[] args) {

        RectangleService rs = new RectangleService();
        CircleService cs = new CircleService();

        Rectangle rectangle = rs.createRectangle();
        System.out.println(rectangle);

        Circle circle = cs.createCircle();
        System.out.println(circle);
    }
}
