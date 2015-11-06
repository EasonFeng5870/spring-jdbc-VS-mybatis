package mysql.performance.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import mysql.performance.dao.VicUserDao;
import mysql.performance.dao.VicUserDaoForMybatis;
import mysql.performance.modules.User;

public class VicUserServiceImpl implements VicUserService {
	
	private VicUserDao vicUserDao;
	
	private @Autowired VicUserDaoForMybatis vicUserDaoForMybatis;
	
	public void setVicUserDao(VicUserDao vicUserDao) {
		this.vicUserDao = vicUserDao;
	}

	public List<User> getUsers(String num) {
		return vicUserDao.getUsers(num);
	}

	public List<User> getUsersForMybatis() {
		long t_start = System.currentTimeMillis();
		List<User> users = vicUserDaoForMybatis.getUsers();
		System.out.println(System.currentTimeMillis()-t_start);
		System.out.println(users.size());
		return users;
	}

	public int addUser(User user) {
		return vicUserDao.addUser(user);
	}

	public int addUserFromMybatis(User user) {
		long t_start = System.currentTimeMillis();
		int i = 0;
		i = vicUserDaoForMybatis.addUser(user);
		System.out.println(System.currentTimeMillis()-t_start);
		return i;
	}

	public int updateUser(User user) {
		return vicUserDao.updateUser(user);
	}

	public int updateUserForMybatis(User user) {
		long t_start = System.currentTimeMillis();
		int i = 0;
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", user.getAvatarRvStatus()+"");
		i = vicUserDaoForMybatis.updateUser(map);
		System.out.println(System.currentTimeMillis()-t_start);
		return i;
	}

	public int deleteUser(int i) {
		return vicUserDao.deleteUser(i);
	}

	public int deleteUserFromMybatis(int i) {
		long t_start = System.currentTimeMillis();
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", i+"");
		int k = vicUserDaoForMybatis.deleteUser(map);
		System.out.println(System.currentTimeMillis()-t_start);
		return k;
	}

}
