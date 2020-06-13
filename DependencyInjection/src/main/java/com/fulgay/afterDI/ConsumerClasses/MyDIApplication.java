package com.fulgay.afterDI.ConsumerClasses;

/**
 * MyDIApplication
 *
 * @author Fırat ÜLGAY
 * @since 5.230.0
 */

import com.fulgay.afterDI.ServiceClasses.MessageService;

/**
 * Bağımlılığı azaltmak için daha önce MyApplication classında oluşturduğumuz email service nesnesini MyDIApplication class'ının constructor ına parametre olarak geçebiliriz.
 * Bu yöntem ile  MyDIApplication class'ının EmailService class'ına bağımlılığını azaltmış olduk.
 */

public class MyDIApplication implements Consumer {

    private MessageService service;

    public MyDIApplication(MessageService svc){
        this.service=svc;
    }

    @Override
    public void processMessages(String msg, String rec){
        this.service.sendMessage(msg, rec);
    }
}
