public class Triangle {

    //Static variable==> can be reached directly over class like Triangle.numOfSides
    static int numOfSides=3;
//    Attributes are referring to additional information of an object. Properties are describing the characteristics of an object

//    instance variables
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

//    Every class contains a constructor method that can create instances
// create constructor
    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree){
        this.base=base;
        this.height=height;
        this.sideLenOne=sideLenOne;
        this.sideLenTwo=sideLenTwo;
        this.sideLenThree=sideLenThree;
    }
// This is an instance method(aka non-static method), we must call it over an instance.
    // If it was a static method(aka class method), we would call it directly over the Class (like Math.pow())
    public double findArea(){
        return this.base*this.height/2;
    }
}
