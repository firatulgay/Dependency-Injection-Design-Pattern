package com.fulgay.afterDI.InjectorsClasses;

import com.fulgay.afterDI.ConsumerClasses.Consumer;

/**
 * MessageServiceInjector
 *
 * @author Fırat ÜLGAY
 * @since 5.230.0
 */
public interface MessageServiceInjector {

    public Consumer getConsumer();
}
