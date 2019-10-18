package com.company.Bridge;

public class LinuxImp implements ImageImp{

    @Override
    public void doPrint(Matrix m) {
        System.out.print("在Linux操作系统中显示图像：");
    }
}
