package com.lingdian;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Base64.Decoder decoder = Base64.getDecoder();
        Base64.Encoder encoder = Base64.getEncoder();
        String str = "women";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println(new String(bytes));
        //[B@4de8b406
    }

    public static String encodeByMd5(String str) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(md5.digest(str.getBytes("utf-8")));
    }
}
