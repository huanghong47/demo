package cn.huanghong.testWEB.dao;

import cn.huanghong.testWEB.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-02-13 17:14
 */
@Repository
@Mapper
public interface UserDao {

    void insert(UserEntity param);

    List<UserEntity> getlist();

    void insertbatch(List<UserEntity>users);
    UserEntity getuser(@Param("id") Integer id);
}
