package com.mandiri.ubpcph2h.genkey;

import org.apache.commons.codec.digest.DigestUtils;

public class GenKey {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    String telanjang = "Hello";

    System.out.println(telanjang);

    String encrypted = DigestUtils.sha1Hex(telanjang);

    System.out.println(encrypted);

  }

}
