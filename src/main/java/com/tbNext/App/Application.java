package com.tbNext.App;  
  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
import com.tbNext.beans.SampleBean;  
  
public class Application {  
    public static void main(String args[]) {  
        @SuppressWarnings("resource")  
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(  
                "spring-conf.xml");  
  
        SampleBean bean = (SampleBean) applicationContext.getBean("sampleBean");  
        bean.printMe();  
    }  
  
}  