package com.andy.app_mg_plf.dao.devuser;


import com.andy.app_mg_plf.pojo.DevUser;
import org.apache.ibatis.annotations.Param;

public interface DevUserMapper {
	/**
	 * 通过userCode获取User
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public DevUser getLoginUser(@Param("devCode") String devCode)throws Exception;
}
