package cn.huanghong.testWEB.dao;

import cn.huanghong.testWEB.entity.RoleEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-06-27 10:29
 */
@Repository
@Mapper
public interface RoleDao {

    void insert(RoleEntity param);
    List<RoleEntity> getlist();

    void insertbatch(List<RoleEntity>roles);

    List<RoleEntity>getlistByuserid(Integer userid);
}
