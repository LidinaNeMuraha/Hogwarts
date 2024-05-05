public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Harry Potter", 95);
        Hufflepuff cedric = new Hufflepuff("Cedric Diggory", 90);
        Gryffindor hermione = new Gryffindor("Hermione Granger", 98);
        Slytherin draco = new Slytherin("Draco Malfoy", 85);

        System.out.println(harry.compareStudents(cedric));
        System.out.println(hermione.compareStudents(draco));
        System.out.println(harry.compareStudents(hermione));
    }
}