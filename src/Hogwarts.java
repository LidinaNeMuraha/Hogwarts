// Класс Hogwarts описывает основные свойства всех учеников Хогвартса
class Hogwarts {
    private int bravery;
    private int cunning;
    private int loyalty;
    private int intelligence;

    // Конструктор для инициализации свойств ученика
    public Hogwarts(int bravery, int cunning, int loyalty, int intelligence) {
        this.bravery = bravery;
        this.cunning = cunning;
        this.loyalty = loyalty;
        this.intelligence = intelligence;
    }

    // Метод выводит описание студента
    public void printDescription() {
        System.out.println("Bravery: " + bravery);
        System.out.println("Cunning: " + cunning);
        System.out.println("Loyalty: " + loyalty);
        System.out.println("Intelligence: " + intelligence);
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
}




