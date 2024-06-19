class Ravenclaw extends Hogwarts {
    private int wisdom;
    private int creativity;
    private int learning;

    public Ravenclaw(int bravery, int cunning, int loyalty, int intelligence, int magicPower, int transgressionDistance, int wisdom, int creativity, int learning) {
        super(bravery, cunning, loyalty, intelligence, magicPower, transgressionDistance);
        this.wisdom = wisdom;
        this.creativity = creativity;
        this.learning = learning;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Wisdom: " + wisdom);
        System.out.println("Creativity: " + creativity);
        System.out.println("Learning: " + learning);
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public int getLearning() {
        return learning;
    }

    // Метод для сравнения учеников Когтеврана по свойствам факультета
    public static void compareStudents(Ravenclaw student1, Ravenclaw student2) {
        int sum1 = student1.getWisdom() + student1.getCreativity() + student1.getLearning();
        int sum2 = student2.getWisdom() + student2.getCreativity() + student2.getLearning();
        if (sum1 > sum2) {
            System.out.println(student1 + " is a better Ravenclaw than " + student2);
        } else {
            System.out.println(student2 + " is a better Ravenclaw than " + student1);
        }
    }
}