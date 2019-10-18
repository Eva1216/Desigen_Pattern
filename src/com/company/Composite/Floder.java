package com.company.Composite;

import java.util.ArrayList;

public class Floder extends AbstractFile{
    private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();
    private String name;
    public Floder(String name){
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return (AbstractFile)fileList.get(i);
    }

    @Override
    public void killVirus() {
        for (Object obj : fileList) {
            ((AbstractFile)obj).killVirus();
        }
    }
}
