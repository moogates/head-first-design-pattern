package me.muyuwei.hfdp.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
    private PersonBean person;
    OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args); // get方法都可以调用
            } else if (method.getName().equals("setHotOrNotRating")) {
                throw new IllegalAccessException(); // 不能评价自己
            } else if (method.getName().startsWith("set")) {
                return method.invoke(person, args); // 其他set操作可以执行
            }
        } catch (InvocationTargetException ex) {
            // InvocationTargetException是由代理模式的RealSubject抛出的异常
            ex.printStackTrace();
        }

        return null; // 如果调用其他方法，一律或略不理
    }
}
