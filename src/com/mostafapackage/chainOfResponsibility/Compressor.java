package com.mostafapackage.chainOfResponsibility;

public class Compressor  extends  Handler{
    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest httpRequest) {
        System.out.println("compressing");
        return false;
    }


}
