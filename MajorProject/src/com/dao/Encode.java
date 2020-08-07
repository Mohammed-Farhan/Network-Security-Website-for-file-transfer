package com.dao;

import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Encode {
	
	public static void main(String[] args)  {
		String str = "Welcome to see, java.util.Base64";
		Base64.Encoder base64Encoder= Base64.getEncoder();
		//encoding byte array into base 64
		byte[] byteArray = null;
		try {
		    byteArray = base64Encoder.encode(str.getBytes("UTF-8")); //1st layer
		    System.out.println("Base64 Encoded String : " + new String(byteArray,"UTF-8"));
		    String key = "abdfsajfklsaadcv";
		    Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES");//2nd layer
			// encrypt the text
			cipher.init(Cipher.ENCRYPT_MODE, aesKey);//3rd layer
			byte[] encrypted = cipher.doFinal(byteArray);
			System.out.println(new String(encrypted));
			// decrypt the text
			cipher.init(Cipher.DECRYPT_MODE, aesKey);
			String decrypted = new String(cipher.doFinal(encrypted));
			System.out.println(decrypted);
		    //decoding byte array into base64
		    Base64.Decoder base64Decoder= Base64.getDecoder();
		    byte[] strdec=base64Decoder.decode(decrypted.getBytes());
		   System.out.println("Base64 Decoded String : " + new String(strdec,"UTF-8"));
		  } catch (Exception e) {
		      e.printStackTrace();
		  }
	}
}
