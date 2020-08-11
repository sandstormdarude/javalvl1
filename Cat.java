package homework5;

public class Cat extends Animals {
    public Cat(String name) {
        super(name);
        this.maxJump = 2.0;
        this.maxRun = random.nextInt(200);
        this.species = "Кот";
    }

    @Override
    public void swim(int dist) {
        System.out.println("Котики не могут плавать!");
    }
}
