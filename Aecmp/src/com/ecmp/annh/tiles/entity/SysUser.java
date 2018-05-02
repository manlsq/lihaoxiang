package com.ecmp.annh.tiles.entity;

import java.sql.Timestamp;
import java.util.Collection;

/**
 * 放在session中的用户信息.
 */
@SuppressWarnings("serial")
public class SysUser {

	private String userId;
	/** 显示名称 **/
	private String displayName;
	/** 手机号码 **/
	private String mobilePhone;
	/** 最后登录时间 **/
	private Timestamp lastLoginDate;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public Timestamp getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Timestamp lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
}
