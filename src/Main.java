public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 15 Pro", "15.11.2024", "Apple Inc.", "USA", 6999, false);
        productsArray[2] = new Product("Xiaomi Mix 7", "20.01.2025", "Xiaomi Ltd.", "China", 3999, true);
        productsArray[3] = new Product("Sony Xperia XZ", "05.12.2024", "Sony", "Japan", 4899, false);
        productsArray[4] = new Product("Nokia Brick 9000", "01.01.2000", "Nokia", "Finland", 999, true);

        for (Product product : productsArray) {
            product.printInfo();
        }
    }
}
