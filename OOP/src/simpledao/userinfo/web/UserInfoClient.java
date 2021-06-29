package simpledao.userinfo.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import simpledao.domain.userinfo.UserInfo;
import simpledao.domain.userinfo.dao.UserInfoDao;
import simpledao.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import simpledao.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("12345");
		userInfo.setPasswd("@23#");
		userInfo.setUserName("MJY");
		
		
		UserInfoDao userInfoDao = null;
		
		if (dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}
		else if (dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMysqlDao();
		}
		else {
			System.out.println("db support error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		
	}

}
