package com.fulgay.afterDI;

import com.fulgay.afterDI.ConsumerClasses.Consumer;
import com.fulgay.afterDI.InjectorsClasses.EmailServiceInjector;
import com.fulgay.afterDI.InjectorsClasses.MessageServiceInjector;
import com.fulgay.afterDI.InjectorsClasses.SmsServiceInjector;

/**
 * MyMessageDITest
 *
 * @author Fırat ÜLGAY
 * @since 5.230.0
 */

/**
 * Burada görüldüğü üzere şu andan itibaren application class'larımız sadece serviceleri kullanmaktan sorumlu.
 * Diğer yandan ileride uygulamamız örneğin facebook mesajı da göndersin istersek tek yapılması gereken Service ce Injector classlarının yazılmasıdır.
 * Böylelikle Dependecy Injection Design Pattern ile bağımlılıkları azaltıp aynı zamanda genişletilebilir de bir yapı kurmuş olduk.
 *
 */
public class MyMessageDITest {

    public static void main(String[] args) {
        String msg = "Hi Fırat";
        String email = "firatulgay@gmail.com";
        String phone = "5113242322";
        MessageServiceInjector injector = null;
        Consumer app = null;

        //Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        //Send SMS
        injector = new SmsServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }
}
