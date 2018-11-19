package tech.lewiszlw.proxypattern;

import tech.lewiszlw.proxypattern.subject.Image;
import tech.lewiszlw.proxypattern.subject.RealImage;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/7/18
 * Time:10:48
 */
public class ImageProxy implements Image {

    private RealImage realImage;
    private String filename;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if(realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
        afterDisplay();
    }

    private void afterDisplay() {
        System.out.println("图片展示完成。");
    }
}
