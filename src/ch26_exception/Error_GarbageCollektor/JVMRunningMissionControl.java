package ch26_exception.Error_GarbageCollektor;

import java.util.Date;

public class JVMRunningMissionControl {
    public static void main(String[] args) {

        Runtime rt=Runtime.getRuntime();
        System.out.println("rt.totalMemory() = " + rt.totalMemory());
        System.out.println("rt.freeMemory() = " + rt.freeMemory());

        Date d=null;
        for (int i=0; i<10000; i++) {

            d=new Date(i);
            d=null;
        }

        System.out.println("for loop sonrası rt.totalMemory() = " + rt.totalMemory());
        rt.gc();
        System.gc();
        System.out.println(" for loop sonrası rt.freeMemory() = " + rt.freeMemory());
    }
}
