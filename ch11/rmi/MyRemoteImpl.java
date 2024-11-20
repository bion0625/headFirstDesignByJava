package ch11.rmi;

import java.io.Serial;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String sayHello() throws RemoteException {
        return "server says, 'hey'";
    }

    public MyRemoteImpl() throws RemoteException {}

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099); // RMI 레지스트리 생성
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service); // 원격 객체 등록
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
