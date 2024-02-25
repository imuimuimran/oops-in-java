class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing can be done py pen.");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

public class oopClsObj_02_pen {
    public static void main(String[] args) {
        Pen pen1 = new Pen(); 
        pen1.color = "Blue";
        pen1.type = "Jel";

        pen1.write();

        pen1.printColor();
    }
}
