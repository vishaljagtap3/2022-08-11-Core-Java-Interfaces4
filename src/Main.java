public class Main {
    public static void main(String[] args) {

        /*Student s1 = new Student(22, "DD", 34);
        Student s2 = new Student(29, "AA", 69);
        System.out.println( s2.compare(s1));*/

        Student [] students = {
                new Student(101, "AA", 90),
                new Student(501, "BB", 50),
                new Student(301, "CC", 60),
                new Student(201, "DD", 80),
                new Student(601, "EE", 40),
        };

        Util.sort(students);
        for(Student student : students) {
            System.out.println(student);
        }

    }
}
