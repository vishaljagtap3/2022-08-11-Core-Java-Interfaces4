public class Student implements Comparable {

    private int roll;
    private String name;
    private int marks;

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public int compare(Object obj) {
       /* this -> s1
                obj -> s2*/
        Student s = (Student) obj;
        if (this.marks == s.marks) {
            return 0;
        }

        if(this.marks > s.marks) {
            return 1;
        }

        return -1;
    }
}
