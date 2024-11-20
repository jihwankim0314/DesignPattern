package org.designpattern._02_structural._2_one_to_many._3_proxy.code;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk();
    }

    @Override
    public void display() {
        System.out.println("이미지를 보여줍니다.");
    }

    private void loadImageFromDisk() {
        System.out.println("이미지를 디스크에서 로딩");
    }
}
