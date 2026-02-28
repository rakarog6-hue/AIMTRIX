package com.aimtrix.optimizer;

public class GamingOptimizer {

    public void optimize() {

        Runtime.getRuntime().gc();
        System.runFinalization();

    }

}
