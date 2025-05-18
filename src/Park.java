public class Park {
    String parkName;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    // Внутренний класс
    public class Attraction {
        String name;
        String workingHours;
        double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printAttractionInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Цена: " + price + " руб.");
            System.out.println("-----------");
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Парк аттракционов");

        Park.Attraction carousel = park.new Attraction("Карусель", "10:00 - 18:00", 150);
        Park.Attraction rollerCoaster = park.new Attraction("Американские горки", "12:00 - 20:00", 300);
        Park.Attraction hauntedHouse = park.new Attraction("Дом с привидениями", "16:00 - 22:00", 250);

        carousel.printAttractionInfo();
        rollerCoaster.printAttractionInfo();
        hauntedHouse.printAttractionInfo();
    }
}
