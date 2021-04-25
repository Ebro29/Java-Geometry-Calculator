 public class Circle extends Shape{
     /***
      * @auth Ebrahim Shahid
      */
    private long centerX;
    private long centerY;
    private double radius;

    /***
     * Constructor for 2 centers and radius
     */
    public Circle(long x, long y, double r) throws ArithmeticException{
        this.centerX = x;
        this.centerY = y;
        this.radius = r;
        calcArea();
    }

    /***
     * This is an override calcArea method from the Shape superclass for Circle area calculations
     */
    @Override
    public void calcArea(){
        this.area = (3.14519*this.radius*this.radius); //Pi*Radius^2
    }

    /***
     * This is an override toString method from the Shape superclass modified to show the results of Circle objects
     */
    @Override
    public String toString(){
        return "circle area is " + this.getArea() + "\nradius:" + this.radius + "\tx-coordinate:" + this.centerX + "\ty-coordinate:" + this.centerY;
    }

    /***
     * Lines 37 to 61 are the get and set methods
     * Accessors and mutators to retrieve and update the radius, centerX, and CenterY variables
     */
    public long getCenterX() {
        return centerX;
    }

    public void setCenterX(long centerX) {
        this.centerX = centerX;
    }

    public long getCenterY() {
        return centerY;
    }

    public void setCenterY(long centerY) {
        this.centerY = centerY;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

