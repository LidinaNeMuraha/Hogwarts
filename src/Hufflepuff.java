class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int patience;
    private int loyalty;

    public Hufflepuff(int bravery, int cunning, int loyalty, int intelligence, int magicPower, int transgressionDistance, int hardWork, int patience, int loyaltyHouse) {
        super(bravery, cunning, loyalty, intelligence, magicPower, transgressionDistance);
        this.hardWork = hardWork;
        this.patience = patience;
        this.loyalty = loyaltyHouse;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Hard Work: " + hardWork);
        System.out.println("Patience: " + patience);
        System.out.println("House Loyalty: " + loyalty);
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getPatience() {
        return patience;
    }

    public int getLoyaltyHouse() {
        return loyalty;
    }

    // Метод для сравнения учеников Пуффендуя по свойствам факультета
    public static void compareStudents(Hufflepuff student1, Hufflepuff student2) {
        int sum1 = student1.getHardWork() + student1.getPatience() + student1.getLoyaltyHouse();
        int sum2 = student2.getHardWork() + student2.getPatience() + student2.getLoyaltyHouse();
        if (sum1 > sum2) {
            System.out.println(student1 + " is a better Hufflepuff than " + student2);
        } else {
            System.out.println(student2 + " is a better Hufflepuff than " + student1);
        }
    }
}