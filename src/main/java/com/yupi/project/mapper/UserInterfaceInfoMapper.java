package com.yupi.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yupi.yuapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * @Entity generator.domain.UserInterfaceInfo
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
//select interfaceInfoId,sum(totalNum) as totalNum from user_interface_info group by interfaceInfoId order by totalNum desc limit 3;
    //查询用户接口信息表中，按照指定的limit参数进行筛选
    //返回前limit条记录的接口信息列表
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




