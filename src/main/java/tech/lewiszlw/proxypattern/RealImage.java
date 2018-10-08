package tech.lewiszlw.proxypattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/7/18
 * Time:10:43
 */
public class RealImage implements Image{

    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying: " + filename);
    }

    private void loadFromDisk(String filename) {
        System.out.println("Loading: " + filename);
    }
}
