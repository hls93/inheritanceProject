package com.company;

import java.time.LocalDateTime;

public class EmailNotification extends Notification implements Cloneable{

    private String recipient;
    private String smtpProvider;

    //must create a constructor that takes both notification and emailnotification variables
    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
    }


    public String getRecipient() {

        return recipient;
    }

    public String getSmtpProvider() {

        return smtpProvider;

    }

    @Override
    public void transport() throws NoTransportException {

        System.out.println("Recipient is: " + getRecipient() + "Provider is: " + getSmtpProvider() + "Subject is: "  +  getSubject() + "body is: " + getBody() + this.status);
    }

    @Override
    public void printSomeText() {
        super.printSomeText();
        System.out.println("hello you");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        if (recipient != null ? !recipient.equals(that.recipient) : that.recipient != null) return false;
        return smtpProvider != null ? smtpProvider.equals(that.smtpProvider) : that.smtpProvider == null;
    }

    @Override
    public int hashCode() {
        int result = recipient != null ? recipient.hashCode() : 0;
        result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
        return result;
    }




    @Override
    protected Object clone()  {

        return new EmailNotification(getSubject(), getBody(), getRecipient(), getSmtpProvider());

    }
}
