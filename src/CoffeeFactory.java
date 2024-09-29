    // Factory Method
    public class CoffeeFactory {
        private CoffeeIngredientFactory ingredientFactory;

        public CoffeeFactory(CoffeeIngredientFactory ingredientFactory) {
            this.ingredientFactory = ingredientFactory;
        }

        // для создания кофе с уникальными характеристиками
        public Coffee createCoffee(String type) {
            Coffee coffee = null;
            if (type.equalsIgnoreCase("IceLatte")) {
                coffee = new IceLatte(ingredientFactory);
            } else if (type.equalsIgnoreCase("Cappuccino")) {
                coffee = new Cappuccino(ingredientFactory);
            } else {
                System.out.println("Извините, мы не готовим " + type);
            }
            return coffee;
        }
    }

