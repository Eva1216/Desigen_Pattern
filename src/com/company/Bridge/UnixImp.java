package com.company.Bridge;

public class UnixImp implements ImageImp{

    @Override
    public void doPrint(Matrix m) {
        System.out.print("在Unix操作系统中显示图像：");
    }
}
