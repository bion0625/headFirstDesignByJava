package ch11.rmi;

import java.rmi.Naming;

public class MyRemoteClient {

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {

        try {

            MyRemote server = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");

            String s = server.sayHello();

            System.out.println(s);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
