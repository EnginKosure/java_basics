public class Triangle {
//    instance variables
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

//    create constructor
    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree){
        this.base=base;
        this.height=height;
        this.sideLenOne=sideLenOne;
        this.sideLenTwo=sideLenTwo;
        this.sideLenThree=sideLenThree;
    }
// This is an instance method, we must call it over an instance.
    // If it was a static method, we would call it directly over the Class (like Math.pow())
    public double findArea(){
        return this.base*this.height/2;
    }
}
