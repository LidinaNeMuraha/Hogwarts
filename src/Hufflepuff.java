public class Hufflepuff extends Hogwarts {
    private int loyaltyLevel;

    public Hufflepuff(String name, int loyaltyLevel) {
        super(name);
        this.loyaltyLevel = loyaltyLevel;
    }

    @Override
    public String compareStudents(Hogwarts student) {
        if (student instanceof Hufflepuff) {
            if (this.loyaltyLevel > ((Hufflepuff) student).loyaltyLevel) {
                return this.name + " is more loyal than " + student.name;
            } else {
                return student.name + " is more loyal than " + this.name;
            }
        } else {
            return "Cannot compare students from different houses";
        }
    }
}