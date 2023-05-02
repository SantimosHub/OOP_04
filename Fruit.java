abstract class Fruit {
    private String name;



    public String getName() {
        return name;
    }

    protected float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}
