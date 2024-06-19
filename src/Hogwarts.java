class Hogwarts {
    private int bravery;
    private int cunning;
    private int loyalty;
    private int intelligence;
    private int magicPower;
    private int transgressionDistance;

    // Конструктор для инициализации свойств ученика
    public Hogwarts(int bravery, int cunning, int loyalty, int intelligence, int magicPower, int transgressionDistance) {
        this.bravery = bravery;
        this.cunning = cunning;
        this.loyalty = loyalty;
        this.intelligence = intelligence;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    // Метод выводит описание студента
    public void printDescription() {
        System.out.println("Bravery: " + bravery);
        System.out.println("Cunning: " + cunning);
        System.out.println("Loyalty: " + loyalty);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Magic Power: " + magicPower);
        System.out.println("Transgression Distance: " + transgressionDistance);
    }

    // Геттеры для доступа к свойствам ученика
    public int getBravery() {
        return bravery;
    }

    public int getCunning() {
        return cunning;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
}


