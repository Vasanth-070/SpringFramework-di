package vasanth.springFramework.DependancyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import vasanth.springFramework.DependancyInjection.controllers.ConstructorInjection;
import vasanth.springFramework.DependancyInjection.controllers.MyController;
import vasanth.springFramework.DependancyInjection.controllers.PropertyInjection;
import vasanth.springFramework.DependancyInjection.controllers.SetterInjecction;

@SpringBootApplication
public class DependancyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(DependancyInjectionApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());
		System.out.println("----------------Property---------------");
		PropertyInjection propertyInjection =(PropertyInjection) ctx.getBean("propertyInjection");
		System.out.println(propertyInjection.getGreeting());
		System.out.println("----------------Setter---------------");
		SetterInjecction setterInjecction =(SetterInjecction) ctx.getBean("setterInjecction");
		System.out.println(setterInjecction.getGreeting());
		System.out.println("----------Constructor------------");
		ConstructorInjection constructorInjection =(ConstructorInjection) ctx.getBean("constructorInjection");
		System.out.println(constructorInjection.getGreeting());

	}

}
