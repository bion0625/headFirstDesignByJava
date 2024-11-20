package ch11.datingService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class NonOwnerInvocationHandler implements InvocationHandler {

    Person person;

    public NonOwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

        try {
            if (method.getName().equals("setGreekRating") || method.getName().startsWith("get")) {
                return method.invoke(person, args);
            }
            else throw new IllegalAccessException();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
