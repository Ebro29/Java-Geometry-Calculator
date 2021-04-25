import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Scanner;
/***
 * @auth Ebrahim Shahid
 * This is the driver class to create and test objects
 */

public class TestShape {
    public static void main(String[] args) throws InvalidParameterException {
        //TODO Auto-generated method stub
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter the 3 values for your circle: center x, center y, and radius (e.g 2 3 2");
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        Shape circle = new Circle(a,b,c);
        System.out.println("Please enter the 2 values for your rectangle: Height and Width (e.g 5 7");
        int h = reader.nextInt();
        int w = reader.nextInt();
        Shape rectangle = new Rectangle(h,w);
        shapeList.add(circle);
        shapeList.add(rectangle);
        /***
         * For loop to iterate through the shape list and call their respective toString methods
         */
        for(int i=0;i<shapeList.size();i++){
            System.out.println(shapeList.get(i).toString());
        }
    }
}
