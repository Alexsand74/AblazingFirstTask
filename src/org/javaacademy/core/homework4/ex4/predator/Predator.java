package org.javaacademy.core.homework4.ex4.predator;

import org.javaacademy.core.homework4.ex4.Live;

public abstract class Predator extends Live {
    //Хищник
    //Умеет нападать на живое. В случае если вес жертвы больше хищника, то хищник погибает,
    //иначе вес хищника увеличивается на треть веса жертвы и жертва погибает.
    //Может нападать только при живом состоянии, иначе выпадает ошибка "Животное не может нападать".
    private static final int SHARE_WEIGHT_RECEIVED = 3;
    private static final int QUANTITY_AFTER_COMMA = 1000;

    public Predator(double weight) {
        super(weight);
    }

    public void attack(Live live) throws Exception {
        if (!(live.isLife())) {
            throw new Exception("Животное не может нападать");
        }
        if (live.getWeight() > this.getWeight()) {
            this.dies();
        } else {
            double temp = (live.getWeight() / SHARE_WEIGHT_RECEIVED) * QUANTITY_AFTER_COMMA;
            temp = Math.ceil(temp) / QUANTITY_AFTER_COMMA;
            this.setWeight(this.getWeight() + temp);
            live.dies();
        }

    }
}
