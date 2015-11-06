package mysql.performance.dao;

import java.util.List;

import mysql.performance.modules.User;

public interface VicUserDao {
	
	public List<User> getUsers(String num);
	
	public int addUser(User user);

	public int updateUser(User user);

	public int deleteUser(int i);

}
