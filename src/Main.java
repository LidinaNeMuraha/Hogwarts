public class Main {
    // Метод для сравнения учеников одного факультета по свойствам факультета
    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        if (student1.getBravery() + student1.getCunning() + student1.getLoyalty() + student1.getIntelligence() >
                student2.getBravery() + student2.getCunning() + student2.getLoyalty() + student2.getIntelligence()) {
            System.out.println("Student 1 is better than Student 2");
        } else {
            System.out.println("Student 2 is better than Student 1");
        }
    }

    // Метод для сравнения любых учеников по характеристикам всей школы
    public static void compareAllStudents(Hogwarts student1, Hogwarts student2) {
        int magicPower1 = student1.getBravery() + student1.getCunning() + student1.getLoyalty() + student1.getIntelligence();
        int magicPower2 = student2.getBravery() + student2.getCunning() + student2.getLoyalty() + student2.getIntelligence();
        if (magicPower1 > magicPower2) {
            System.out.println("Student 1 has greater magical power than Student 2");
        } else if (magicPower1 < magicPower2) {
            System.out.println("Student 2 has greater magical power than Student 1");
        } else {
            System.out.println("Both students have equal magical power");
        }
    }

    public static void main(String[] args) {
        // Создаем учеников каждого факультета
        Gryffindor harry = new Gryffindor(80, 70, 90, 85);
        Slytherin draco = new Slytherin(85, 90, 70, 80);
        Hufflepuff cedric = new Hufflepuff(75, 75, 95, 80);
        Ravenclaw luna = new Ravenclaw(70, 85, 80, 95);

        // Выводим описание студентов
        System.out.println("Description of Harry:");
        harry.printDescription();
        System.out.println();

        System.out.println("Description of Draco:");
        draco.printDescription();
        System.out.println();

        // Сравниваем учеников Гриффиндора по свойствам факультета
        System.out.println("Comparing students from Gryffindor:");
        compareStudents(harry, draco);
        System.out.println();

        // Сравниваем любых учеников по характеристикам всей школы
        System.out.println("Comparing all students:");
        compareAllStudents(harry, draco);
    }
}