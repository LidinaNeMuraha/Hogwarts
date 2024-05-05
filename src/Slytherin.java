public class Slytherin extends Hogwarts {
    private int cunningLevel;

    public Slytherin(String name, int cunningLevel) {
        super(name);
        this.cunningLevel = cunningLevel;
    }

    @Override
    public String compareStudents(Hogwarts student) {
        if (student instanceof Slytherin) {
            if (this.cunningLevel > ((Slytherin) student).cunningLevel) {
                return this.name + " is more cunning than " + student.name;
            } else {
                return student.name + " is more cunning than " + this.name;
            }
        } else {
            return "Cannot compare students from different houses";
        }
    }
}
