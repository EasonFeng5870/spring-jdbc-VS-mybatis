package mysql.performance;

import mysql.performance.modules.User;
import mysql.performance.service.VicUserService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringJdbcPerformanceTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		ApplicationContext context = new FileSystemXmlApplicationContext("/resources/applicationContext.xml");
//		System.out.println(context);
		VicUserService vicUserService = (VicUserService)context.getBean("vicUserService");
		//select
//		vicUserService.getUsersForMybatis();
//		List<User> users = vicUserService.getUsers("1");
//		System.out.println(users.size());
		//insert
		User user = new User();
		user.setAvatar("www.baidu.com");
//		System.out.println(vicUserService.addUser(user));
//		System.out.println(vicUserService.addUserFromMybatis(user));
		//update
		int i = 130;
		user.setNicknameRvStatus(i);
//		System.out.println(vicUserService.updateUserForMybatis(user));
		
//		vicUserService.updateUser(user);
		
//		vicUserService.deleteUser(i);
		
		vicUserService.deleteUserFromMybatis(i);
	}


}
