package com.coppel.enviocorreomasivo.controllers;



import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import Utilerias.HttpUtils;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@Controller

@RequestMapping("/api")
public class GetIpController {
	 @GetMapping(
		        value = "ip"
		        //produces = MediaType.TEXT_PLAIN_VALUE
		    )
		

		
	@ResponseBody
	public String getIP(HttpServletRequest request) {
		 String ipv = null;
		String ip = HttpUtils.getRequestIP(request);
		 System.out.println(ip);
		 
		 if(ip.equalsIgnoreCase("0:0:0:0:0:0:0:1")){
			 try { 
				 	
				 	ipv = InetAddress.getLocalHost().getHostAddress();
				 	System.out.println(ipv);
				 	return ipv;
			 	} catch (UnknownHostException e) {
			 		return null; 
			 } 
		 }
		 
		 return ipv;
	}		
}