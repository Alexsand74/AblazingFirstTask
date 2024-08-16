package org.javaacademy.core.homework3.phone_factory;

import org.javaacademy.core.homework3.phone_factory.spare_parts.Frame;

public class SamsungFactory {
    static public Samsung createPhone() {
        Frame frame = new Frame(60, 200, 15);
        return new Samsung(16, 1500, frame);
    }
}
