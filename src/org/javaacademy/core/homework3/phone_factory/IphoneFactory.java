package org.javaacademy.core.homework3.phone_factory;

import org.javaacademy.core.homework3.phone_factory.spare_parts.Frame;

public class IphoneFactory {
    public static Iphone createPhone () {
        Frame frame = new Frame(60, 200, 10);
        return new Iphone(8, 1000, 1000, frame);
    }
}
