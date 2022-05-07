package Flugel;

public class Eagle extends Flugel{

    @Override
    public void eatFood()
    {
        System.out.println("Ich esse kleine Säugtiere");
    }

    @Override
    public void fly()
    {
        System.out.println("Eagle Fly");
    }

    @Override
    public void liftOff()
    {
        System.out.println("Eagle liftOff");
    }

    @Override
    public void land()
    {
        System.out.println("Eagle land");
    }


}
