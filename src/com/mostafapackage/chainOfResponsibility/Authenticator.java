package com.mostafapackage.chainOfResponsibility;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest httpRequest) {
        var isValid = (httpRequest.getUsername() ==
                "mostafa" &&
                httpRequest.getPassword() == "123");
        System.out.println("Authenticating");
        return !isValid;
    }
}
