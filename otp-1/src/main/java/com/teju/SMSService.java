package com.teju;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import com.twilio.rest.api.v2010.account.Message;

import com.twilio.Twilio;
import com.twilio.type.PhoneNumber;

@Service
public class SMSService implements CommandLineRunner {
	public static final String ACCOUNT_SID = "ACf42df8b0adc679b8d2d424cfdf4520f2";
	public static final String AUTH_TOKEN = "3b51a86fdddf89ec51e045379fbfea45";
	public static final int otp = (int) (Math.random() * 1000000);

	@Override
	public void run(String... args) throws Exception {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		Message.creator(new PhoneNumber("+919880993893"), new PhoneNumber("+12058314283"),
				"Welcome User to Online Shopping!! Your OTP is " + otp).create();

	}

}
