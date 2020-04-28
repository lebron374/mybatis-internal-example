package cn.edu.example.mapper;

import org.apache.ibatis.annotations.Param;

import cn.edu.example.entity.ImcUser;

/**
 * @author virgil.Wang
 * @date 2020/4/28 14:03
 */
public interface UserMapper {

    /**
     * 根据userId获取记录
     * @param userId 用户编号
     * @return
     */
    ImcUser getById(@Param("userId") Integer userId);

}
