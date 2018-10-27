package com.apress.prospring5.ch11;

import com.apress.prospring5.ch11.config.ScheduleAnnoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class ScheduleTaskAnnotationDemo {

	public static void main(String... args) throws Exception {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(ScheduleAnnoConfig.class);

		System.in.read();

		ctx.registerShutdownHook();
	}
} 
