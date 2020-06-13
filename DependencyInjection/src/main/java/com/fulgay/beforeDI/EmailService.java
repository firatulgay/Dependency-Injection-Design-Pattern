package com.fulgay.beforeDI;

/**
 * EmailServiceImpl
 *
 * @author Fırat ÜLGAY
 * @since 5.230.0
 */
public class EmailService {

    public void sendEmail(String message, String receiver){
        //logic to send email
        System.out.println("Email sent to "+receiver+ " with Message="+message);
    }
}
