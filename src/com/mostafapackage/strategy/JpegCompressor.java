package com.mostafapackage.strategy;

public class JpegCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("compressing using jpeg");
    }
}
