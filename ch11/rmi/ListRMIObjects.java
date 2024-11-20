package ch11.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ListRMIObjects {
    public static void main(String[] args) {
        try {
            // RMI 레지스트리 연결
            String[] boundObjects = Naming.list("rmi://127.0.0.1:1099");
            System.out.println("Objects bound to RMI Registry:");
            for (String name : boundObjects) {
                System.out.println(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

