public class Main {

    public static void main(String[] args) {

        // 1.
        Student myStudent = new Student("Алиса", "Смит", "Коктем-2", 24);
        System.out.println(myStudent);

        Student myStudent1 = new Student("Азамат", "Джон", "г.Астана", 24);
        System.out.println(myStudent1);

        Student myStudent2 = new Student("Кристина", "Иванова", "г.Алматы", 24);
        System.out.println(myStudent2);

        Student myStudent3 = new Student();
        System.out.println(myStudent3);

        // 2.

        Triangle myTriangle = new Triangle(3, 4, 5);

        double myPerimetr = myTriangle.Perimetr();
        double myArea = myTriangle.Area();

        System.out.println("Периметр= " + myPerimetr);
        System.out.println("Площадь= " + myArea);
    }
}