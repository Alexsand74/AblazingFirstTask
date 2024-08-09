package org.javaacademy.core.homework3.phoneFactory;

import org.javaacademy.core.homework3.phoneFactory.spareParts.Frame;

public class IphoneFactory {
    static public Iphone weDo() {
        Frame frame = new Frame(60, 200, 10);
        return new Iphone(8, 1000, 1000, frame);
    }
}
