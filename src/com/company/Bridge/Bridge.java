package com.company.Bridge;

import com.company.XMLUtil.XmlUtil;

import javax.imageio.stream.ImageInputStreamImpl;



public class Bridge {
    public static void main(String[] args) {
        Image image;
        ImageImp imp;
        image = (Image) XmlUtil.getBean("image");
        imp = (ImageImp)XmlUtil.getBean("os");
        image.setImageImp(imp);
        image.parseFile("小龙女");

    }
}

class Matrix{

}

abstract class Image{
    protected ImageImp imp;
    public void setImageImp(ImageImp imp){
        this.imp = imp;
    }
    public abstract void parseFile(String fileName);
}

interface ImageImp{
    public void doPrint(Matrix m);
}

