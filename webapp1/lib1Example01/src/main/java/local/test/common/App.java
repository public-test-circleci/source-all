package local.test.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module3.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();

    }
}
