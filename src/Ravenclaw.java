public class Ravenclaw extends Hogwarts {
    private int intelligenceLevel;

    public Ravenclaw(String name, int intelligenceLevel) {
        super(name);
        this.intelligenceLevel = intelligenceLevel;
    }

    @Override
    public String compareStudents(Hogwarts student) {
        if (student instanceof Ravenclaw) {
            if (this.intelligenceLevel > ((Ravenclaw) student).intelligenceLevel) {
                return this.name + " is smarter than " + student.name;
            } else {
                return student.name + " is smarter than " + this.name;
            }
        } else {
            return "Cannot compare students from different houses";
        }
    }
}