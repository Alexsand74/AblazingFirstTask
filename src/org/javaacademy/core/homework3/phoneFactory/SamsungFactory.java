package org.javaacademy.core.homework3.phoneFactory;

import org.javaacademy.core.homework3.phoneFactory.spareParts.Frame;

public class SamsungFactory {
    static public Samsung weDo() {
        Frame frame = new Frame(60, 200, 15);
        return new Samsung(16, 1500, frame);
    }
}
