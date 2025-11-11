package org.jresmgr;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class Main {
    public static void main() {
        OperatingSystemMXBean osbean = ManagementFactory.getOperatingSystemMXBean();

        //print total system cpu load
        System.out.println();
        System.out.println("System CPU Load -> " + osbean.getSystemLoadAverage() * 100 + "%");
        System.out.println("OS version      -> " + osbean.getVersion());
    }

}
