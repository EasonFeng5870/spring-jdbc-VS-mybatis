package mysql.performance.service;

import java.util.List;

import mysql.performance.modules.User;

public interface VicUserService {
	
	public List<User> getUsers(String num);
	public List<User> getUsersForMybatis();
	public int addUser(User user);
	public int addUserFromMybatis(User user);
	public int updateUser(User user);
	public int updateUserForMybatis(User user);
	public int deleteUser(int i);
	public int deleteUserFromMybatis(int i);
	
}
