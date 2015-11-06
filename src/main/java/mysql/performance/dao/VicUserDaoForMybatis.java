package mysql.performance.dao;

import java.util.List;
import java.util.Map;

import mysql.performance.common.MyBatisRepository;
import mysql.performance.modules.User;

@MyBatisRepository
public interface VicUserDaoForMybatis {
	
	public List<User> getUsers();

	public int addUser(User user);

	public int updateUser(Map<String, String> map);

	public int deleteUser(Map<String, String> map);

}
