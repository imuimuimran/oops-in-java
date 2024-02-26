class Student {
    String stdName;
    int stdAge;
    
    public void studentInfo() {
        System.out.println(this.stdName);
        System.out.println(this.stdAge);
    }
}

public class oopClsObj_03_student {
    public static void main(String[] args) {

        Student student01 = new Student();
        Student student02 = new Student();

        student01.stdName = "ABRAR";
        student01.stdAge = 13;

        student02.stdName = "AKAS";
        student02.stdAge = 14;

        student01.studentInfo();
        student02.studentInfo();
        
    }
}