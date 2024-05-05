public class Gryffindor extends Hogwarts {
    private int braveryLevel;

    public Gryffindor(String name, int braveryLevel) {
        super(name);
        this.braveryLevel = braveryLevel;
    }

    @Override
    public String compareStudents(Hogwarts student) {
        if (student instanceof Gryffindor) {
            if (this.braveryLevel > ((Gryffindor) student).braveryLevel) {
                return this.name + " is braver than " + student.name;
            } else {
                return student.name + " is braver than " + this.name;
            }
        } else {
            return "Cannot compare students from different houses";
        }
    }
}
