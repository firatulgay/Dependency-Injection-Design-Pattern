package com.fulgay.afterDI.ServiceClasses;

/**
 * SmsServiceImpl
 *
 * @author Fırat ÜLGAY
 * @since 5.230.0
 */
public class SmsServiceImpl implements MessageService {

    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("SMS sent to "+rec+ " with Message = "+msg);
    }
}
