package com.andy.app_mg_plf.dao.datadictionary;

import com.andy.app_mg_plf.pojo.DataDictionary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataDictionaryMapper {
	
	public List<DataDictionary> getDataDictionaryList(@Param("typeCode") String typeCode)throws Exception;
}
