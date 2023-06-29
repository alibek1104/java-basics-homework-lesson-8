public class Main {

    public static void main(String[] args) {

        // 1.
        Student myStudent = new Student("Алиса", "Смит", "Коктем-2", 24);
        System.out.println(myStudent.toString());

        Student myStudent1 = new Student("Азамат", "Джон", "г.Астана", 24);
        System.out.println(myStudent1.toString());

        Student myStudent2 = new Student("Кристина", "Иванова", "г.Алматы", 24);
        System.out.println(myStudent2.toString());

        Student myStudent3 = new Student();
        System.out.println(myStudent3.toString());

        System.out.println("");

        // 2.

        Triangle myTriangle = new Triangle(3, 4, 5);

        double myPerimetr = myTriangle.Perimetr();
        double myArea = myTriangle.Area();

        System.out.println("Периметр = " + myPerimetr);
        System.out.println("Площадь = " + myArea);

        System.out.println("");

        // 3.

        Rectangle myRectangle = new Rectangle(5, 9);
        int firstArea = myRectangle.returnArea();
        System.out.println("Площадь первого прямоугольника равна: " + firstArea);

        Rectangle myRectangle1 = new Rectangle(10, 14);
        int secondArea = myRectangle1.returnArea();
        System.out.println("Площадь второго прямоугольника равна: " + secondArea);

        System.out.println("");

        // 4.

        Average myAverage = new Average(1, 1, 1);
        double averageNum = myAverage.getAverageNum();
        System.out.println("Среднее значение равно: " + averageNum);

        System.out.println("");

        // 5.

        Movie movie1 = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
        System.out.println(movie1.toString());
        Movie movie2 = new Movie("Главный герой", "20th Century Studios");
        System.out.println(movie2.toString());


    }
}