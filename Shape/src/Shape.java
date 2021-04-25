public abstract class Shape {
    /***
     * @auth Ebrahim Shahid
     * Object Oriented Programming Lab 4 -Polymorphism with shapes
     * This is the parent class which will be inherited by other classes for polymorphism
     */

    /***
     * getArea method will store the data of a calculated area
     */
    protected double area; //variable to store area
    public double getArea(){
        return this.area;
    }

    public abstract void calcArea();

    /***
     *
     * @return Returns the area of the specified shape based on the child class
     */
    public String toString(){
        return "area is" + this.area;
    }
}
