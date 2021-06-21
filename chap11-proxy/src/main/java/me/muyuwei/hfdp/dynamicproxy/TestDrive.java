package me.muyuwei.hfdp.dynamicproxy;

import java.lang.reflect.Proxy;

public class TestDrive {
    public TestDrive() {
    }

    private PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                        person.getClass().getInterfaces(),
                        new OwnerInvocationHandler(person));
    }

    private PersonBean getPersonFromDatabase(String name) {
        PersonBean person = new PersonBeanImpl();
        person.setName(name);
        person.setGender("男");
        person.setInterests("运动");
        person.setHotOrNotRating(5);
        person.setHotOrNotRating(4);
        person.setHotOrNotRating(3);
        person.setHotOrNotRating(2);
        person.setHotOrNotRating(1);
        return person;
    }

    public void drive() {
        PersonBean myw = getPersonFromDatabase("Yuwei Mu");
        PersonBean ownerProxy = getOwnerProxy(myw);
        ownerProxy.setInterests("看书，投资");
        System.out.println("call ok");
        try {
            ownerProxy.setHotOrNotRating(5);
        } catch (Exception ex) {
            // ex.printStackTrace();
            System.out.println("owner can't set rating : " + ex.toString());
        }
    }

    public static void main(String[] args) {
        TestDrive test = new TestDrive();
        test.drive();
    }
}
