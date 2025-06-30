/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/15
 * Time: 17:21
 */
public class Dog extends Animal {
    private int leg;

    public Dog() {
    }

    public Dog(int leg) {
        this.leg = leg;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    @Override
    void makeSound() {
        System.out.println("Gaau gaau");
    }

    @Override
    public String toString() {
        return "Day la lop Dog";
    }

}
