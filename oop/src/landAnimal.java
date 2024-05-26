public  class landAnimal extends animal{
    @Override
    String move() {
        return "swing on trees";
    }

    public static class LandAnimal extends animal { // Changed class name to start with uppercase letter

        public static void main(String[] args) {
            LandAnimal lion = new LandAnimal(); // Corrected class name to start with uppercase letter
            LandAnimal monkey = new LandAnimal();
            monkey.move();

        }
    }

}
