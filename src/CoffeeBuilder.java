    //Builder
    public class CoffeeBuilder {
        private String type;
        private String milk;
        private String syrup;

        public CoffeeBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public CoffeeBuilder addMilk(String milk) {
            this.milk = milk;
            return this;
        }

        public CoffeeBuilder addSyrup(String syrup) {
            this.syrup = syrup;
            return this;
        }

        public Coffee build() {
            return new CustomCoffee(type, milk, syrup);
        }
    }
