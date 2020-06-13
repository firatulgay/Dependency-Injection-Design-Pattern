package com.fulgay.afterDI.InjectorsClasses;

import com.fulgay.afterDI.ConsumerClasses.Consumer;
import com.fulgay.afterDI.ConsumerClasses.MyDIApplication;
import com.fulgay.afterDI.ServiceClasses.SmsServiceImpl;

/**
 * SmsServiceInjector
 *
 * @author Fırat ÜLGAY
 * @since 5.230.0
 */
public class SmsServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SmsServiceImpl());
    }
}
