package com.company.build;

import com.company.XMLUtil.XmlUtil;

public class Build {
    public static void main(String[] args) {
        ActorBuilder ab;
        ab = (ActorBuilder) XmlUtil.getBean();

        Actor actor;
        actor = AngelBuilder.construt(ab);
        String type = actor.getType();
        System.out.println(type + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + (actor.getHairstyle()==null?"没有头发":actor.getHairstyle()));
    }
}


abstract class ActorBuilder{
    protected static Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();
    public boolean isBareheaded(){
        return false;
    }
    public static Actor construt (ActorBuilder ab){
        ab.buildType();
        ab.buildCostume();
        ab.buildFace();
        ab.buildSex();
        if (!ab.isBareheaded())
        {
            ab.buildHairstyle();
        }

        return actor;
    }


}

