package com.example.registration.service;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

import org.springframework.stereotype.Service;

@Service
public class BCryptPasswordEncoder {
	
	public String encode(String code){
		  Base64.Encoder encoder = Base64.getMimeEncoder();  
	      String message = "Hello, \nYou are informed regarding your inconsistency of work";  
	      String eStr = encoder.encodeToString(code.getBytes());  
	     // System.out.println("Encoded MIME message: "+eStr); 
	      return eStr;
	}
	
	public String decode(String code){
		 // Getting MIME decoder  
	      Base64.Decoder decoder = Base64.getMimeDecoder();  
	      
	      String dStr = new String(decoder.decode(code));  
	    //  System.out.println("Decoded message: "+dStr);  
	      return dStr;
		
	}
      
  }