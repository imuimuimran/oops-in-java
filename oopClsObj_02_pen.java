class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing can be done py pen.");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void printType() {
        System.out.println(this.type);
    }
}

public class oopClsObj_02_pen {
    public static void main(String[] args) {
        Pen pen1 = new Pen(); 
        pen1.color = "Blue";
        pen1.type = "Jel";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "ballpoint";

        pen1.write();

        pen1.printColor();
        pen1.printType();

        pen2.printColor();
        pen2.printType();
    }
}
