class Student {
    String name;
    int mark;

    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public static void main(String args[]) {
        Student s1 = new Student("Chamodi", 50);
        Student s2 = new Student("Neranjana", 38);
        Student s3 = new Student("Tharushi", 80);
        Student s4 = new Student("Rivindu", 90);
        Student s5 = new Student("Thilan", 98);

        Student[] students = new Student[5];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        double total = 0;

        for (int i = 0; i < students.length; i++) {
            total += students[i].mark;
        }

        System.out.println("Aveage: " + total / students.length);
    }
}