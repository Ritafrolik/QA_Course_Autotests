public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик"),
                new Cat("Мурзик"),
                new Cat("Снежок")
        };

        Dog dog = new Dog("Бобик");

        System.out.println("=== Проверка бега и плавания ===");
        for (Cat cat : cats) {
            cat.run(150);
            cat.swim(5);
        }

        dog.run(450);
        dog.swim(8);
        System.out.println();

        Bowl bowl = new Bowl(25);

        System.out.println("=== Коты кушают ===");
        for (Cat cat : cats) {
            cat.eat(bowl, 10);
            cat.info();
        }

        System.out.println();
        bowl.info();

        // 4. Итог
        System.out.println();
        System.out.println("Котов: " + Cat.getCatCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Всего животных: " + Animal.animalCount);
    }
}
