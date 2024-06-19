public class Main {
    // Метод для сравнения учеников по характеристикам всей школы
    public static void compareAllStudents(Hogwarts student1, Hogwarts student2) {
        if (student1.getMagicPower() > student2.getMagicPower()) {
            System.out.println(student1 + " has greater magical power than " + student2);
        } else if (student1.getMagicPower() < student2.getMagicPower()) {
            System.out.println(student2 + " has greater magical power than " + student1);
        } else {
            System.out.println("Both students have equal magical power");
        }

        if (student1.getTransgressionDistance() > student2.getTransgressionDistance()) {
            System.out.println(student1 + " can transgress further than " + student2);
        } else if (student1.getTransgressionDistance() < student2.getTransgressionDistance()) {
            System.out.println(student2 + " can transgress further than " + student1);
        } else {
            System.out.println("Both students have equal transgression distance");
        }
    }

    public static void main(String[] args) {
        // Создаем учеников каждого факультета
        Gryffindor harry = new Gryffindor(80, 50, 60, 70, 90, 85, 95, 80, 90);
        Gryffindor ron = new Gryffindor(70, 40, 50, 60, 80, 75, 85, 70, 80);

        Slytherin draco = new Slytherin(60, 90, 50, 70, 85, 80, 90, 85, 75);
        Slytherin pansy = new Slytherin(50, 80, 40, 60, 75, 70, 80, 75, 65);

        Hufflepuff cedric = new Hufflepuff(70, 60, 90, 60, 85, 80, 95, 85, 80);
        Hufflepuff susan = new Hufflepuff(60, 50, 80, 50, 75, 70, 85, 75, 70);

        Ravenclaw luna = new Ravenclaw(50, 70, 60, 90, 80, 85, 95, 90, 85);
        Ravenclaw cho = new Ravenclaw(40, 60, 50, 80, 70, 75, 85, 80, 75);

        // Выводим описание студентов
        System.out.println("Harry Potter:");
        harry.printDescription();
        System.out.println();

        System.out.println("Draco Malfoy:");
        draco.printDescription();
        System.out.println();

        System.out.println("Cedric Diggory:");
        cedric.printDescription();
        System.out.println();

        System.out.println("Luna Lovegood:");
        luna.printDescription();
        System.out.println();

        // Сравниваем учеников одного факультета
        System.out.println("Comparing Gryffindor students:");
        Gryffindor.compareStudents(harry, ron);
        System.out.println();

        System.out.println("Comparing Slytherin students:");
        Slytherin.compareStudents(draco, pansy);
        System.out.println();

        System.out.println("Comparing Hufflepuff students:");
        Hufflepuff.compareStudents(cedric, susan);
        System.out.println();

        System.out.println("Comparing Ravenclaw students:");
        Ravenclaw.compareStudents(luna, cho);
        System.out.println();

        // Сравниваем учеников по общим характеристикам
        System.out.println("Comparing students across houses:");
        compareAllStudents(harry, draco);
        System.out.println();

        compareAllStudents(cedric, luna);
    }
}