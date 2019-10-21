package com.company.Command;

public class HelpCommand extends Command{
    private HelpHandler hhobj;
    public HelpCommand(){
        hhobj = new HelpHandler();
    }


    @Override
    public void execute() {
        hhobj.display();
    }
}
