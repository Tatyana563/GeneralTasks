package oop.designpattern10_2_wiki;


    class Pizza {
        private String dough = "";
        private String sauce = "";
        private String topping = "";

        public void setDough(String dough) {
            this.dough = dough; }
        public void setSauce(String sauce){
            this.sauce = sauce;
        }

        @Override
        public String toString() {
            return "Pizza{" +
                    "dough='" + dough + '\'' +
                    ", sauce='" + sauce + '\'' +
                    ", topping='" + topping + '\'' +
                    '}';
        }

        public void setTopping(String topping){
            this.topping = topping; }

    }

