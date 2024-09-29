    //Abstract Factory
    public class LatteIngredientFactory implements CoffeeIngredientFactory {
        @Override
        public String addMilk() {
            return "Овсяное молоко";
        }

        @Override
        public String addSyrup() {
            return "Кокосовый сироп";
        }
    }