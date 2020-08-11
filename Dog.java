package homework5;

public class Dog extends Animals {
    public Dog (String name) {
        super(name);
        this.species = "Собака";
        this.maxRun = random.nextInt(500);
        this.maxSwim = random.nextInt(10);
        this.maxJump = Math.random() * 0.4 + 0.1;
    }
}
