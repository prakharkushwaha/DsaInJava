
public class GetterSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setSize(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getSize());
    }

}

class Pen {
    String color;
    int size;

    void setColor(String color) {
        this.color = color;

    }

    void setSize(int size) {
        this.size = size;
    }

    String getColor() {
        return this.color;
    }

    int getSize() {
        return this.size;
    }
}
