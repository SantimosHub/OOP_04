
class Orange extends Fruit {
    private final String name = "Апельсины";

    public Orange(float weight) {
        super(weight = 15);
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", name, weight);
    }
}