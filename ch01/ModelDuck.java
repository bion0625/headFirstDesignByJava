package ch01;

public class ModelDuck extends Duck{

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
