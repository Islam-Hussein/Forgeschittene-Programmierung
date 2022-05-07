package Flugel;

public class Penguin extends Flugel{


    public void jumpIntoWater()
    {
        System.out.println("Penguin Jump into Water");
    }

    public void leaveWater()
    {
        System.out.println("Penguin Leaves Water !!");
    }

    public void swim()
    {
        System.out.println("Penguin swims");
    }

    @Override
    public void eatFood()
    {
        System.out.println("Penguin esse Fische");
    }


    @Override
    public void liftOff() {}

    @Override
    public void land() {}

    private Float maxWaterVelocity;

    public Float getMaxWaterVelocity() {
        return maxWaterVelocity;
    }

    public void setMaxWaterVelocity(Float maxWaterVelocity) {
        this.maxWaterVelocity = maxWaterVelocity;
    }
}
