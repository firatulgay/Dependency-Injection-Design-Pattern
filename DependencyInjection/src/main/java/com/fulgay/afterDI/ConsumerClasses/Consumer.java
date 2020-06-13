package com.fulgay.afterDI.ConsumerClasses;

/**
 * Consumer
 *
 * @author Fırat ÜLGAY
 * @since 5.230.0
 */
public interface Consumer {
    void processMessages(String msg, String rec);
}
