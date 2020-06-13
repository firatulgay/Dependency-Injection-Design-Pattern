package com.fulgay.beforeDI;

/**
 * MyDIApplication
 *
 * @author Fırat ÜLGAY
 * @since 5.230.0
 */
public class MyApplication {

    /**
     *  MyDIApplication class ı email service i başlatıp kullanmaktan sorumlu bir class. EmailServiceImpl objesinin bu classta new ile oluşturularak
     *  bir bağımlıklık oluşturması hard-code bir bağımlılık yapısı oluşturur.
     *
     *  İleride başka bir email servisi kullanılmak istenirse veya yeni bir özellik (Sms veya Facebook mesajı gibi) MyDIApplication classında ve
     *  kullanılan diğer classlarda değişiklik yapılması gerekir.
     */

    private EmailService email = new EmailService();

    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        email.sendEmail(msg, rec);
    }
}
