package pl.raziel.spring;

import org.springframework.beans.factory.InitializingBean;

public class SomeBean implements InitializingBean{
	public void init() {
		System.out.println("Method inside of bean");
	}

	public void isWorking() {
		System.out.println("I'm working!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("LOL");
	}
}
