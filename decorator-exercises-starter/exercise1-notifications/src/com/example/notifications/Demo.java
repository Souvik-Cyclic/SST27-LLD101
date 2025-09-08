package com.example.notifications;

/**
 * Starter demo that uses only the existing Email notifier.
 * TODOs guide you to add decorators and compose them.
 */
public class Demo {
    public static void main(String[] args) {
        Notifier base = new EmailNotifier("user@example.com");

        System.out.println("\nEmail only:");
        // Baseline behavior (already works)
        base.notify("Baseline email only.");

        // === YOUR TASKS ===
        // 1) Create a base decorator class: NotifierDecorator implements Notifier and wraps another Notifier.
        // 2) Create concrete decorators:
        //      - SmsDecorator (adds SMS send)
        //      - WhatsAppDecorator (adds WhatsApp send)
        //      - SlackDecorator (adds Slack send)
        // 3) Compose at runtime to achieve these combinations:
        //      a) Email + SMS
        //      b) Email + WhatsApp
        //      c) Email + Slack
        //      d) Email + WhatsApp + Slack
        //
        // Example (after you implement):
        System.out.println("\nEmail + SMS:");
        Notifier smsAndEmail = new SmsDecorator(base, "+91-99999-11111");
        smsAndEmail.notify("Hello");

        System.out.println("\nEmail + WhatsApp:");
        Notifier whatsappAndEmail = new WhatsAppDecorator(base, "user_wa");
        whatsappAndEmail.notify("Hello");

        System.out.println("\nEmail + Slack:");
        Notifier slackAndEmail = new SlackDecorator(base, "deployments");
        slackAndEmail.notify("Deployment completed");

        System.out.println("\nEmail + WhatsApp + Slack:");
        Notifier full = new SlackDecorator(new WhatsAppDecorator(base, "user_wa"), "deployments");
        full.notify("Deployment completed");
    }
}
