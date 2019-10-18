package com.company.Bridge;

public class WindowsImp implements ImageImp{

    @Override
    public void doPrint(Matrix m) {
        System.out.print("在Windows操作系统中显示图像：");
    }
}
