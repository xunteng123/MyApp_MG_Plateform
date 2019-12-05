package com.andy.app_mg_plf.service.developer;

import com.andy.app_mg_plf.pojo.DataDictionary;

import java.util.List;

public interface DataDictionaryService {
	
	/**
	 * 根据typeCode查询相应的数据字典列表
	 * @param typeCode
	 * @return
	 * @throws Exception
	 */
	public List<DataDictionary> getDataDictionaryList(String typeCode)throws Exception;
}
