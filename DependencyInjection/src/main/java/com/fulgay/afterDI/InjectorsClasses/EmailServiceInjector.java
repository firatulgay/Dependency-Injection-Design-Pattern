package com.fulgay.afterDI.InjectorsClasses;

import com.fulgay.afterDI.ConsumerClasses.Consumer;
import com.fulgay.afterDI.ServiceClasses.EmailServiceImpl;
import com.fulgay.afterDI.ConsumerClasses.MyDIApplication;

/**
 * EmailServiceInjector
 *
 * @author Fırat ÜLGAY
 * @since 5.230.0
 */
public class EmailServiceInjector implements MessageServiceInjector {

    EmailServiceImpl emailService = new EmailServiceImpl();

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(emailService);
    }
}
