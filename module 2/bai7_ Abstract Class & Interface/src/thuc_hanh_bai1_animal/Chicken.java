package thuc_hanh_bai1_animal;

import thuc_hanh_bai1_edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : cluck_cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
