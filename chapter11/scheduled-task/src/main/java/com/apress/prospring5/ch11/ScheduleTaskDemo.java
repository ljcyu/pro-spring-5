package com.apress.prospring5.ch11;

import com.apress.prospring5.ch11.config.ScheduleXmlConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class ScheduleTaskDemo {

	public static void main(String... args) throws Exception {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(ScheduleXmlConfig.class);

		System.in.read();
		System.out.println("will close ScheduleTaskDemo");
		ctx.registerShutdownHook();
	}
}
