package com.teju;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SMSController {
	@RequestMapping(method = RequestMethod.GET,value = "/validateOtp/{otp}")
	public String validateOtp(@PathVariable int otp) {

		if (otp == SMSService.otp) {
			return "Entered Otp is valid";
		} else
         return "Entered Otp is NOT valid. Please Retry!";

	}


}