package ch11;

import java.rmi.Naming;

// java ch11/GumballMachineTestDrive santafe.mightygumball.com 100
// java ch11/GumballMachineTestDrive boulder.mightygumball.com 100
// java ch11/GumballMachineTestDrive austin.mightygumball.com 100

// javac -encoding UTF-8 ch11/GumballMonitorTestDrive.java
// java ch11/GumballMonitorTestDrive



public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {"rmi://127.0.0.1/santafe.mightygumball.com/gumballMachine",
                "rmi://127.0.0.1/boulder.mightygumball.com/gumballMachine",
                "rmi://127.0.0.1/austin.mightygumball.com/gumballMachine"};

        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try{
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < location.length; i++) {
            monitor[i].report();
        }
    }
}
