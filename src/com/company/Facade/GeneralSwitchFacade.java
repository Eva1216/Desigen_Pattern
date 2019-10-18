package com.company.Facade;

public class GeneralSwitchFacade {
    private Light lights[]=new Light[4];

    private AirConditioner ac;


    public GeneralSwitchFacade()
    {
        lights[0]=new Light("1");
        lights[1]=new Light("2");
        lights[2]=new Light("3");
        lights[3]=new Light("4");

        ac=new AirConditioner();

    }

    public void on()
    {
        lights[0].on();
        lights[1].on();
        lights[2].on();
        lights[3].on();

        ac.on();

    }

    public void off()
    {
        lights[0].off();
        lights[1].off();
        lights[2].off();
        lights[3].off();

        ac.off();

    }
}
