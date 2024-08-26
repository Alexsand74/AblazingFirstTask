package org.javaacademy.core.homework5.ex1;

import java.math.BigDecimal;

public enum Countries {
    // String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
    RUSSIA("Россия"),
    FRANCE("Франция"),
    CHINA("Китай"),
    JAPAN("Япония"),
    TURKIYE("Турция");
    private String name;
    private BigDecimal donations;

    Countries(String name) {
        this.name = name;
        this.donations = BigDecimal.ZERO;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getDonations() {
        return donations;
    }

    public void setDonations(BigDecimal donations) {
        this.donations = donations;
    }
}
