
public class Constructors {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        Pen p1 = new Pen("red", 6);
        System.out.println(p1.color);

        System.out.println(p1.size);

    }

}

class Pen {
    String color;
    int size;

    // this is the constructor whose name is same as class name
    // constructor is always called when object is created
    // this is PARAMETERISED constructor;
    Pen(String color, int size) {
        this.color = color;
        this.size = size;

    }

    Pen() {
        System.out.println("this is constructor is callled and this is the default constructor non parameterised");
    }

}
