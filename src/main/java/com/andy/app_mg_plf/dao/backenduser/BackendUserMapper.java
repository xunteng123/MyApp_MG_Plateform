package com.andy.app_mg_plf.dao.backenduser;

import com.andy.app_mg_plf.pojo.BackendUser;
import org.apache.ibatis.annotations.Param;

public interface BackendUserMapper {

	/**
	 * 通过userCode获取User
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public BackendUser getLoginUser(@Param("userCode") String userCode)throws Exception;

}
