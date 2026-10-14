package com.mul;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("singleton")
public class Airtel implements Sim{

	@Override
	public void call() {
		System.out.println("Airtel calling");
		
	}

}
