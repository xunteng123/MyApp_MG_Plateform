package com.andy.app_mg_plf.service.developer;


import com.andy.app_mg_plf.pojo.DevUser;

public interface DevUserService {
	/**
	 * 用户登录
	 * @param devCode
	 * @param devPassword
	 * @return
	 */
	public DevUser login(String devCode, String devPassword) throws Exception;
}
