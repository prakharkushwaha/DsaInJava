
public class BasicClassObject {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("red");
        p1.setSize(5);

        System.out.println(p1.color);
        System.out.println(p1.size);

    }

}

// always try to make classes below of the main classes
class Pen {
    String color;
    int size;

    void setColor(String color) {
        this.color = color;

    }

    void setSize(int size) {
        this.size = size;
    }
}
