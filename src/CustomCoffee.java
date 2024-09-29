    //Builder
    public class CustomCoffee extends Coffee {
        public CustomCoffee(String type, String milk, String syrup) {
            this.name = type;
            this.milk = milk;
            this.syrup = syrup;
        }

        @Override
        public void prepare() {
            // Пустая реализация кофе собран
        }
    }