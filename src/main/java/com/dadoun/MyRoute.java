package com.dadoun;


import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import com.dadoun.entity.Evenement;


@Component

public class MyRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {

		 
from("jpa:com.dadoun.entity.Evenement?consumeDelete=false&consumer.resultClass=com.dadoun.entity.Evenement"
+ "&consumer.nativeQuery=select * FROM evenement where DATE_FORMAT(`dateexec`, '%Y-%m-%d')=CURRENT_DATE&consumer.Delay=10000000")
.to("restlet:http://localhost:" + 8080 + "/rest/afficher?restletMethod=GET");
		

    }
}
		

	


