class Slytherin extends Hogwarts {
    private int ambition;
    private int resourcefulness;
    private int determination;

    public Slytherin(int bravery, int cunning, int loyalty, int intelligence, int magicPower, int transgressionDistance, int ambition, int resourcefulness, int determination) {
        super(bravery, cunning, loyalty, intelligence, magicPower, transgressionDistance);
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.determination = determination;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Ambition: " + ambition);
        System.out.println("Resourcefulness: " + resourcefulness);
        System.out.println("Determination: " + determination);
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getDetermination() {
        return determination;
    }

    // Метод для сравнения учеников Слизерина по свойствам факультета
    public static void compareStudents(Slytherin student1, Slytherin student2) {
        int sum1 = student1.getAmbition() + student1.getResourcefulness() + student1.getDetermination();
        int sum2 = student2.getAmbition() + student2.getResourcefulness() + student2.getDetermination();
        if (sum1 > sum2) {
            System.out.println(student1 + " is a better Slytherin than " + student2);
        } else {
            System.out.println(student2 + " is a better Slytherin than " + student1);
        }
    }
}
