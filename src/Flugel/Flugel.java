package Flugel;

public class Flugel {
    public void Flugel()
    {    }

    public void fly()
    {
        System.out.println("Flugel Fly");
    }

    public void liftOff()
    {
        System.out.println("Flugel liftOff");
    }

    public void land()
    {
        System.out.println("Flugel land");
    }

    public void eatFood()
    {
        System.out.println("Flugel isst");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Float getMaxAirVelocity() {
        return maxAirVelocity;
    }

    public void setMaxAirVelocity(Float maxAirVelocity) {
        this.maxAirVelocity = maxAirVelocity;
    }

    private String name;
    private Float weight;
    private int age;
    private Float maxAirVelocity;

}
