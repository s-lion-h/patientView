package com.slionh.patientview.mapper;

import com.slionh.patientview.entity.ExpPackage;
import com.slionh.patientview.entity.ExpPackageExample;
import com.slionh.patientview.entity.ExpPackageKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpPackageMapper {
    int countByExample(ExpPackageExample example);

    int deleteByExample(ExpPackageExample example);

    int deleteByPrimaryKey(ExpPackageKey key);

    int insert(ExpPackage record);

    int insertSelective(ExpPackage record);

    List<ExpPackage> selectByExample(ExpPackageExample example);

    ExpPackage selectByPrimaryKey(ExpPackageKey key);

    int updateByExampleSelective(@Param("record") ExpPackage record, @Param("example") ExpPackageExample example);

    int updateByExample(@Param("record") ExpPackage record, @Param("example") ExpPackageExample example);

    int updateByPrimaryKeySelective(ExpPackage record);

    int updateByPrimaryKey(ExpPackage record);
}