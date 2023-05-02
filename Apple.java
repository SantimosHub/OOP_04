
class Apple extends Fruit {
    private final String name = "Яблоки";

    public Apple(float weight) {
        super(weight = 10);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", name, weight);
    }
}


