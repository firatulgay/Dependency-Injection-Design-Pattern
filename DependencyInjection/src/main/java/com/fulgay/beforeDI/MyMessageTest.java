package com.fulgay.beforeDI;

/**
 * MyMessageTest
 *
 * @author Fırat ÜLGAY
 * @since 5.230.0
 */
public class MyMessageTest {

    public static void main(String[] args) {
        MyApplication app = new MyApplication();
        app.processMessages("Merhaba Fırat", "firatulgay@gmail.com");
    }
}
