    //Prototype
    public abstract class Coffee implements Cloneable {
        String name;
        String milk;
        String syrup;

        // клонирование с возможностью персонализации
        public Coffee clone() {
            try {
                return (Coffee) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                return null;
            }
        }

        public abstract void prepare();

        @Override
        public String toString() {
            return name + " с " + milk + " и " + syrup;
        }
    }