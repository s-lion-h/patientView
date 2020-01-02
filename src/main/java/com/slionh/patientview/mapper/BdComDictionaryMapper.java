package com.slionh.patientview.mapper;

import com.slionh.patientview.entity.BdComDictionary;
import com.slionh.patientview.entity.BdComDictionaryExample;
import com.slionh.patientview.entity.BdComDictionaryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BdComDictionaryMapper {
    int countByExample(BdComDictionaryExample example);

    int deleteByExample(BdComDictionaryExample example);

    int deleteByPrimaryKey(BdComDictionaryKey key);

    int insert(BdComDictionary record);

    int insertSelective(BdComDictionary record);

    List<BdComDictionary> selectByExample(BdComDictionaryExample example);

    BdComDictionary selectByPrimaryKey(BdComDictionaryKey key);

    int updateByExampleSelective(@Param("record") BdComDictionary record, @Param("example") BdComDictionaryExample example);

    int updateByExample(@Param("record") BdComDictionary record, @Param("example") BdComDictionaryExample example);

    int updateByPrimaryKeySelective(BdComDictionary record);

    int updateByPrimaryKey(BdComDictionary record);
}