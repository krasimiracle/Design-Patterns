package com.stoyanov5;

public class ObserverDemo {

    public static void main(String[] args) {

        Message message = new Message();

        Observer observer1 = new MessageSubscriber("Observer 1");
        Observer observer2 = new MessageSubscriber("Observer 2");
        Observer observer3 = new MessageSubscriber("Observer 3");
        Observer observer4 = new MessageSubscriber("Observer 4");

        message.register(observer1);
        message.register(observer2);
        message.register(observer3);
        message.register(observer4);

        observer1.setSubject(message);
        observer2.setSubject(message);
        observer3.setSubject(message);
        observer4.setSubject(message);

        observer1.update();
        observer2.update();

        message.sendMessage("Hello World!");
    }
}
