package mysql.performance.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import mysql.performance.modules.User;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;

public class VicUserDaoImpl implements VicUserDao {
	
	private JdbcTemplate jdbcTemplate;

	public List<User> getUsers(String num) {
		long t_start = System.currentTimeMillis();
		final String sql = "select userId,email,emailPassword,password,nickName,os,dtoken,sex,regTime,validateStatus,userType,mobilephone,countrycode,imei,verificode,avatar,avatarMiddle,avatarSmall,district,verifycodeCreationTime,sipDomain,xmppDomain,loginTime,ip,birthday,nicknameRvStatus,avatarRvStatus,signatureRvStatus from cmm_user limit 0 , " + num;
		List<User> users = jdbcTemplate.query(sql, new ResultSetExtractor<List<User>>(){

			public List<User> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<User> users = new ArrayList<User>();
				while(rs.next()){
					User user = new User();
					user.setIp(rs.getString("ip"));
					user.setAvatar(rs.getString("avatar"));
					users.add(user);
				}
				return users;
			}
			
		});
		System.out.println("耗时:" + (System.currentTimeMillis()-t_start)  );
		return users;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int addUser(final User user) {
		long t_start = System.currentTimeMillis();
		final String sql = "insert into test_performance (appKeyName, appId, appKey, userId, token, validTime, createTime, charge) values (?,?,?,?,?,?,?,?)";
		int i = jdbcTemplate.update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, user.getAvatar());
				ps.setString(2, user.getAvatar());
				ps.setString(3, user.getAvatar());
				ps.setLong(4, 122345667778L);
				ps.setString(5, user.getAvatar());
				ps.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
				ps.setTimestamp(7, new Timestamp(System.currentTimeMillis()));
				ps.setInt(8, 1);
			}
			
		});
		System.out.println(System.currentTimeMillis() - t_start);
		return i;
	}

	public int updateUser(User user) {
		long t_start = System.currentTimeMillis();
		final String sql = "update test_performance set appKeyName = 'www.google.com.hk' where id = " + user.getNicknameRvStatus();
		int i = jdbcTemplate.update(sql);
		System.out.println(System.currentTimeMillis() - t_start);
		return i;
	}

	public int deleteUser(int i) {
		long t_start = System.currentTimeMillis();
		final String sql = "delete from test_performance where id = " + i;
		int k = jdbcTemplate.update(sql);
		System.out.println(System.currentTimeMillis() - t_start);
		return k;
	}

}
