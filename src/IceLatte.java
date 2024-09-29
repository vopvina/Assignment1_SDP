    //Prototype
    public class IceLatte extends Coffee {
        CoffeeIngredientFactory ingredientFactory;

        public IceLatte(CoffeeIngredientFactory ingredientFactory) {
            this.ingredientFactory = ingredientFactory;
            this.name = "Айс-Латте";
            prepare();
        }

        @Override
        public void prepare() {
            this.milk = ingredientFactory.addMilk();
            this.syrup = ingredientFactory.addSyrup();
        }
    }
