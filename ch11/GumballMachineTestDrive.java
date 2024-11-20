package ch11;

import java.rmi.Naming;

// javac -encoding UTF-8 ch11/GumballMachineTestDrive.java
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        int count = 0;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);

//            LocateRegistry.createRegistry(1099);
            Naming.rebind(args[0] + "/gumballMachine", gumballMachine);
            System.out.println("connect:" + args[0] + "gumballMachine");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
