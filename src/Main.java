//Assignment1 Main.java
/*import java.util.Scanner;

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
}*/



//Assignment2 Main.java
import Assignment2.Facade.DocumentFacade;
// import Assignment2.Composite.DocumentGroup;
// import Assignment2.Flyweight.DocumentFactory;
// import Assignment2.Adapter.PDFDocumentAdapter;
// import Assignment2.Document;
import Assignment2.Bridge.HighlightRenderEngine;
import Assignment2.Bridge.SimpleRenderEngine;
import Assignment2.Bridge.RenderEngine;

public class Main {
    public static void main(String[] args) {

        DocumentFacade facade = new DocumentFacade();

        // Закомментированы вызовы для предыдущих тестов:

        /*
        // 1. Использование Proxy для ленивой загрузки
        System.out.println("1. Ленивая загрузка документов:");
        facade.displayDocument("Report");

        // 2. Использование декоратора для добавления водяного знака
        System.out.println("\n2. Добавление водяного знака:");
        facade.displayDocumentWithWatermark("Report");

        // 3. Использование Flyweight для повторного использования документа
        System.out.println("\n3. Повторное использование документа:");
        facade.displayDocument("Report");

        // 4. Использование Composite для работы с группой документов
        System.out.println("\n4. Работа с группами документов:");
        DocumentGroup group = new DocumentGroup();
        group.addDocument(DocumentFactory.getDocument("Report"));
        group.addDocument(DocumentFactory.getDocument("Presentation"));
        group.display();

        // 5. Использование Adapter для работы с PDF
        System.out.println("\n5. Работа с PDF документами через Adapter:");
        Document pdfDocument = new PDFDocumentAdapter("document.pdf");
        pdfDocument.display();
        */

        // 6. Использование Bridge для рендеринга (оставлено для проверки новой функциональности)
        System.out.println("\n6. Рендеринг документа через движок:");
        RenderEngine simpleEngine = new SimpleRenderEngine();
        facade.renderDocument("Report", simpleEngine);

        RenderEngine highlightEngine = new HighlightRenderEngine();
        facade.renderDocument("Report", highlightEngine);
    }
}

