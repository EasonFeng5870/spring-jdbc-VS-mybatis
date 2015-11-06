package message;

import java.util.Hashtable;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.DefaultDocumentLoader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.AbstractRefreshableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

@Configuration
@ComponentScan
public class AppAplication {
	
	@Bean
	MessageService mockMessageService(){
		return new MessageService() {
			
			public String getMessage() {
				return "Hello World!";
			}
		};
	}

	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppAplication.class);
		MessagePrinter printer = applicationContext.getBean(MessagePrinter.class);
		printer.printMessage();
		RootBeanDefinition rBeanDefinition;
		XmlBeanDefinitionReader xmlBeanDefinitionReader;
		ConfigurableApplicationContext configurableApplicationContext;
		WebApplicationContext webApplicationContext;
		Resource resource;
		DefaultResourceLoader defaultResourceLoader;
		ResourcePatternResolver resourcePatternResolver;
		AbstractApplicationContext abstractApplicationContext;
		DefaultListableBeanFactory defaultListableBeanFactory;
		BeanPostProcessor beanPostProcessor;
		FileSystemXmlApplicationContext fileSystemXmlApplicationContext;
		AbstractRefreshableApplicationContext abstractRefreshableApplicationContext;
		BeanFactoryPostProcessor beanFactoryPostProcessor;
		
		BeanFactory beanFactory = new DefaultListableBeanFactory();
		System.out.println(beanFactory);
		
		DefaultDocumentLoader defaultDocumentLoader;
		BeanDefinition beanDefinition ;
		
		Map<String, String> map = new Hashtable<String, String>();
		
		ServletContext servletContext;
		
		ContextLoaderListener listener;
		
		DispatcherServlet dispatcherServlet;
		
		WebApplicationContextUtils.getWebApplicationContext(null);
		
		SimpleUrlHandlerMapping simpleUrlHandlerMapping;
		
		
	}
}
