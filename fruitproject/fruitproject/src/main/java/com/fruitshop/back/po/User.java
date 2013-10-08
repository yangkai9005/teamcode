package main.java.com.fruitshop.back.po;

import java.io.Serializable;

import main.java.com.fruitshop.util.RowName;

@SuppressWarnings("serial")
public class User implements Serializable {
	@RowName("system_user_id")
	private String systemUserId;
	@RowName("system_user_name")
	private String systemUserName;
	@RowName("system_user_pwd")
	private String systemUserPwd;
	@RowName("system_auth_id")
	private String SystemAuthId;
	private Auth auth;
	public String getSystemUserName() {
		return systemUserName;
	}
	public void setSystemUserName(String systemUserName) {
		this.systemUserName = systemUserName;
	}
	public String getSystemUserPwd() {
		return systemUserPwd;
	}
	public void setSystemUserPwd(String systemUserPwd) {
		this.systemUserPwd = systemUserPwd;
	}
	public String getSystemAuthId() {
		return SystemAuthId;
	}
	public void setSystemAuthId(String systemAuthId) {
		SystemAuthId = systemAuthId;
	}
	public String getSystemUserId() {
		return systemUserId;
	}
	public void setSystemUserId(String systemUserId) {
		this.systemUserId = systemUserId;
	}
	public Auth getAuth() {
		return auth;
	}
	public void setAuth(Auth auth) {
		this.auth = auth;
	}
	
	
}
