package com.fulgay.afterDI.ServiceClasses;

/**
 * EmailServiceImpl
 *
 * @author Fırat ÜLGAY
 * @since 5.230.0
 */
public class EmailServiceImpl implements MessageService{

    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("Email sent to "+rec+ " with Mesage = " + msg);
    }
}
