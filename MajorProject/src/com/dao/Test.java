package com.dao;


import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import java.security.Key;
import java.util.Base64;
// This is used for 3 layer mechanism and decryption as well.
public class Test {

	public static String encryption(String text, String key) {
		String ekey = "";
		Base64.Encoder base64Encoder= Base64.getEncoder();
		byte[] byteArray = null;
		try {
			// Create key and cipher
			byteArray = base64Encoder.encode(text.getBytes("UTF-8"));
			System.out.println(byteArray);
			Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES");
			// encrypt the text
			cipher.init(Cipher.ENCRYPT_MODE, aesKey);
			byte[] encrypted = cipher.doFinal(byteArray);
			ekey = new String(encrypted);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ekey;
	}

	public static String decryption(String text, String key){
		String ekey = "";
		try {
			// Create key and cipher
			Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES");
			byte[] encrypted = text.getBytes();
			// decrypt the text
			cipher.init(Cipher.DECRYPT_MODE, aesKey);
			String decrypted = new String(cipher.doFinal(encrypted));
			byte [] byteArray = decrypted.getBytes();
			Base64.Decoder base64Decoder= Base64.getDecoder();
		    byte[] strdec=base64Decoder.decode(byteArray);
			ekey = strdec.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ekey;
	}
	
}
