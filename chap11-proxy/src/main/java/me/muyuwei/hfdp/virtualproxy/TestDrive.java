package me.muyuwei.hfdp.virtualproxy;

import javax.swing.*;
import java.net.URL;

public class TestDrive {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Album Cover Viewer");
        URL url;
        try {
            url = new URL("https://dz2cdn1.dzone.com/storage/temp/12434118-spring-boot-logo.png");
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        Icon icon = new ImageProxy(url);
        ImageComponent imageComponent = new ImageComponent(icon);

        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
    }

}
