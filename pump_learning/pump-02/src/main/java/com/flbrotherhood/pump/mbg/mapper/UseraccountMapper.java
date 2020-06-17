package com.flbrotherhood.pump.mbg.mapper;

import com.flbrotherhood.pump.mbg.model.Useraccount;
import com.flbrotherhood.pump.mbg.model.UseraccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UseraccountMapper {
    long countByExample(UseraccountExample example);

    int deleteByExample(UseraccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Useraccount record);

    int insertSelective(Useraccount record);

    List<Useraccount> selectByExample(UseraccountExample example);

    Useraccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Useraccount record, @Param("example") UseraccountExample example);

    int updateByExample(@Param("record") Useraccount record, @Param("example") UseraccountExample example);

    int updateByPrimaryKeySelective(Useraccount record);

    int updateByPrimaryKey(Useraccount record);
}