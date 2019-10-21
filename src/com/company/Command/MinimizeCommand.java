package com.company.Command;

public class MinimizeCommand extends Command{
    private WindowHanlder whObj;
    public MinimizeCommand()
    {
        whObj = new WindowHanlder();
    }

    @Override
    public void execute() {
        whObj.minimize();
    }
}
