class Gryffindor extends Hogwarts {
    private int courage;
    private int determination;
    private int nerve;

    public Gryffindor(int bravery, int cunning, int loyalty, int intelligence, int magicPower, int transgressionDistance, int courage, int determination, int nerve) {
        super(bravery, cunning, loyalty, intelligence, magicPower, transgressionDistance);
        this.courage = courage;
        this.determination = determination;
        this.nerve = nerve;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Courage: " + courage);
        System.out.println("Determination: " + determination);
        System.out.println("Nerve: " + nerve);
    }

    public int getCourage() {
        return courage;
    }

    public int getDetermination() {
        return determination;
    }

    public int getNerve() {
        return nerve;
    }

    // Метод для сравнения учеников Гриффиндора по свойствам факультета
    public static void compareStudents(Gryffindor student1, Gryffindor student2) {
        int sum1 = student1.getCourage() + student1.getDetermination() + student1.getNerve();
        int sum2 = student2.getCourage() + student2.getDetermination() + student2.getNerve();
        if (sum1 > sum2) {
            System.out.println(student1 + " is a better Gryffindor than " + student2);
        } else {
            System.out.println(student2 + " is a better Gryffindor than " + student1);
        }
    }
}