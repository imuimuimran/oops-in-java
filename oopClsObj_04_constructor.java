class Student {
    String stdName;
    int stdAge;

    public void studentInfo() {
        System.out.println(this.stdName);
        System.out.println(this.stdAge);
    }

    // This is a constructor of Student class
    Student(String name, int age) {
        this.stdName = name;
        this.stdAge = age;
    }
}

public class oopClsObj_04_constructor {
    public static void main(String[] args) {
        Student student01 = new Student("Mushfiq", 12);

        student01.studentInfo();
    }
}
