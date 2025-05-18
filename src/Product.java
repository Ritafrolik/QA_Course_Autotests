public class Product {
    String name;
    String productionDate;
    String manufacturer;
    String country;
    double price;
    boolean isBooked;

    // Конструктор
    public Product(String name, String productionDate, String manufacturer,
                   String country, double price, boolean isBooked) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isBooked = isBooked;
    }

    // Метод для вывода информации
    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна: " + country);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Забронировано: " + (isBooked ? "Да" : "Нет"));
        System.out.println("-----------");
    }
}
