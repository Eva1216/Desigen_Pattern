package com.company.Composite;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Composite {
    public static void main(String[] args) {
        AbstractFile file1,file2,file3,file4,file5,folder1,folder2,folder3,folder4;
        folder1 = new Floder("Sunny的资料");
        folder2 = new Floder("图像文件");
        folder3 = new Floder("文本文件");
        folder4 = new Floder("视频文件");
        file1 = new ImageFile("小龙女.jpg");
        file2 = new ImageFile("张无忌.gif");
        file3 = new TextFile("九阴真经.txt");
        file4 = new TextFile("葵花宝典.doc");
        file5 = new VideoFile("笑傲江湖.rmvb");
        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder4.add(file5);
        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);
        folder1.killVirus();
    }
}


abstract class AbstractFile{
    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }
    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }
    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }
    public abstract void killVirus();
}

