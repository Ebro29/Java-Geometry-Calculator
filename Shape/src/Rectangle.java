public class Rectangle extends Shape {
    /***
     * @auth Ebrahim Shahid
     * Rectangle class will have 2 variables: length and width which will be used to calculate areas of rectangles
     */
    private long width;
    private long length;

    public Rectangle(long width, long length) throws ArithmeticException{
        this.width = width;
        this.length = length;
        calcArea();
    }

    /***
     *
     * Accessors and Mutators are made for the width and length of the rectangle object
     */
    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    /***
     * Override is done for calcArea so it is done for rectangles and not other shapes
     */
    @Override
    public void calcArea(){
        this.area = (this.length * this.width);
    }

    /***
     *
     *@return  Override is done to the toString method so its output is about rectangle objects
     */
    @Override
    public String toString(){
        return "area of rectangle is " + this.getArea() + "\nlength is: " + this.length + "\twidth is: " + this.width;
    }
}
