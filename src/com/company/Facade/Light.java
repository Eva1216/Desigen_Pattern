package com.company.Facade;

public class Light
{
    private String position;

    public Light(String position)
    {
        this.position=position;
    }

    public void on()
    {
        System.out.println(this.position + "light on");
    }

    public void off()
    {
        System.out.println(this.position + "light off");
    }
}
