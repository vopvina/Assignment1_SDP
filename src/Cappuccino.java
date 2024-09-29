    //Prototype
    public class Cappuccino extends Coffee {
        CoffeeIngredientFactory ingredientFactory;

        public Cappuccino(CoffeeIngredientFactory ingredientFactory) {
            this.ingredientFactory = ingredientFactory;
            this.name = "Капучино";
            prepare();
        }

        @Override
        public void prepare() {
            this.milk = ingredientFactory.addMilk();
            this.syrup = ingredientFactory.addSyrup();
        }
    }