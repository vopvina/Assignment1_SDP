
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Singleton
        CoffeeShop coffeeShop = CoffeeShop.getInstance();

        // Abstract Factory
        CoffeeIngredientFactory latteFactory = new LatteIngredientFactory(); // Фабрика для ингредиентов латте
        CoffeeIngredientFactory cappuccinoFactory = new CappuccinoIngredientFactory(); // Фабрика для ингредиентов капучино

        // ввод для заказа кофе
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип кофе (IceLatte или Cappuccino): ");
        String type = scanner.nextLine();

        // Factory Method
        Coffee coffee = coffeeShop.orderCoffee(type, type.equalsIgnoreCase("IceLatte") ? latteFactory : cappuccinoFactory);
        System.out.println("Ваш заказ: " + coffee);

        // Prototype
        Coffee clonedOrder = coffee.clone();
        System.out.println("Повторный заказ: " + clonedOrder);

        // Builder
        Coffee customCoffee = new CoffeeBuilder()
                .setType("Custom Coffee") //
                .addMilk("Миндальное молоко")
                .addSyrup("Шоколадный сироп")
                .build();
        System.out.println("Ваш кастомный кофе: " + customCoffee);

        // Singleton для получения текущей скидки
        System.out.println("Скидка на следующий заказ: " + coffeeShop.getDiscount() * 100 + "%");
    }
}

