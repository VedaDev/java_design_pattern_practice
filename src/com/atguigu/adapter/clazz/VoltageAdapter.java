package com.atguigu.adapter.clazz;

import java.util.Objects;

public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    VoltageAdapter(Voltage220V voltage220V) {
       this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {

        int dstV = 0;
        if (Objects.nonNull(this.voltage220V)) {
            int srcV = this.voltage220V.output220V();
            System.out.println("Using Adapter");
            dstV = srcV / 44;
            System.out.println("Adapted Finish");
        }
        return dstV;
    }
}
