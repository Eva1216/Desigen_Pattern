package com.company.Memento;

import java.util.ArrayList;

public class MementoCaretaker{
    private ArrayList mementolist = new ArrayList();


    public ChessmanMemento getMemento(int i){
        return (ChessmanMemento)mementolist.get(i);
    }
    public void setMemento(ChessmanMemento memento){
        mementolist.add(memento);
    }
}
