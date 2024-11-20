package org.designpattern._02_structural._2_one_to_many._3_proxy.code;

public class ProxyClient {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("path1");
        Image image2 = new ProxyImage("path2");

        image1.display(); // 이때 초기화

        image2.display(); // 이때 초기화
    }
}
