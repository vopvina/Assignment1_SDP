    //Abstract Factory
    public class CappuccinoIngredientFactory implements CoffeeIngredientFactory {
        @Override
        public String addMilk() {
            return "Молоко без лактозы";
        }

        @Override
        public String addSyrup() {
            return "Карамельный сироп";
        }
    }