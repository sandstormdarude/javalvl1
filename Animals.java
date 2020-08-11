package homework5;
import java.util.Random;

public class Animals {
    protected String name;
    protected String species;
    protected int maxRun;
    protected int maxSwim;
    protected double maxJump;
    public Random random = new Random();

    public Animals(String name){
        this.name = name;
    }
    public void run(int dist) {
        if (dist <= this.maxRun)
            System.out.println(this.species + " " + this.name + " пробежал" + dist + " метров!");
        else System.out.println(this.species + " " + this.name + " не может столько пробежать!");
    }
    public void swim (int dist) {
        if (dist <= this.maxSwim)
            System.out.println(this.species + " " + this.name + " проплыл" + dist + " метров!");
        else System.out.println(this.species + " " + this.name + " не может столько проплыть!");
    }
    public void jump(double height) {
        if (height <= this.maxJump) {
            System.out.println(this.species + " " + this.name + " подпрыгнул на" + height + " метров!");

        }
        else System.out.println(this.species + " " + this.name + " не может так высоко прыгнуть!");
    }

}



