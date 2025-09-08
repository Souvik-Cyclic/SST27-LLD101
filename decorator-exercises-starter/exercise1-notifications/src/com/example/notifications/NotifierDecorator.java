package com.example.notifications;

public class NotifierDecorator implements Notifier {
    protected Notifier wrappedNotifier;

    public NotifierDecorator(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }

    @Override
    public void notify(String text) {
        wrappedNotifier.notify(text);
    }
}
