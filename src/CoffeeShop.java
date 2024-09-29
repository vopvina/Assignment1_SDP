    //Singleton
    import java.util.HashMap;
    import java.util.Map;

    public class CoffeeShop {
        private static CoffeeShop instance;
        private Map<String, Integer> orders;
        private double discount;

        private CoffeeShop() {
            orders = new HashMap<>();
            discount = 0.0;
        }

        // гарантия единственного экземпляра кофейни
        public static CoffeeShop getInstance() {
            if (instance == null) {
                instance = new CoffeeShop();
            }
            return instance;
        }

        // добавление кофе в заказ
        public void addOrder(String coffeeType) {
            orders.put(coffeeType, orders.getOrDefault(coffeeType, 0) + 1);
            applySpecials(coffeeType);
        }

        // применение специальных акций
        private void applySpecials(String coffeeType) {
            if (orders.get(coffeeType) >= 5) {
                discount = 0.2;  // Скидка 20% после 5 заказов одного типа
                System.out.println("Акция! Скидка 20% на следующий " + coffeeType);
            }
        }

        // получение текущей скидки
        public double getDiscount() {
            return discount;
        }

        // Сброс скидок
        public void resetDiscount() {
            discount = 0.0;
        }

        // оформление заказа
        public Coffee orderCoffee(String type, CoffeeIngredientFactory ingredientFactory) {
            CoffeeFactory factory = new CoffeeFactory(ingredientFactory);
            Coffee coffee = factory.createCoffee(type);
            addOrder(type);
            return coffee;
        }
    }
