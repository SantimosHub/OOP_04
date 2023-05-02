import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Box<T extends Fruit> {
    private List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public String getFruitName() {
        T fruit = fruits.get(0);
        return fruit.getName();

    }

    public int getWeight() {
        int totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public List<T> getFruits() {
        return fruits;
    }


    public void transferFruitsTo(Box<T> secondBox) {
        if (this == secondBox) {
            System.out.println("Это одна и та же коробка" );
            return ;
        }
        if (this.getFruits().get(0) instanceof Orange && secondBox.getFruits().get(0) instanceof Apple) {
            System.out.println("Нельзя высыпать апельсины в яблоки");
        }
        if (this.getFruits().get(0) instanceof Apple && secondBox.getFruits().get(0) instanceof Orange) {
            System.out.println("Нельзя высыпать яблоки в апельсины");
        }
        secondBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    public boolean compare(Box<? extends Fruit> otherBox) {
        return this.getWeight() == otherBox.getWeight();
    }

    @Override
    public String toString() {
        return String.format("коробка  - %s - Вес: %d", this.getFruitName(), (getWeight()));
    }

    public static void showAllBoxes(ArrayList<Box> allBoxes) {
        if (!allBoxes.isEmpty()) {
            for (int i = 0; i < allBoxes.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, allBoxes.get(i));
            }
            System.out.println("-------------------------");
        } else {
            System.out.println("Коробок пока нет.");
        }
    }

}
