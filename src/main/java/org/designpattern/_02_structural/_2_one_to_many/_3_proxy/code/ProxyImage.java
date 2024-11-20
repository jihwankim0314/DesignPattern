package org.designpattern._02_structural._2_one_to_many._3_proxy.code;

public class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName); // 필요할 때 초기화
        }

        realImage.display();
    }
}
