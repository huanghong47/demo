package cn.huanghong.testWEB.service;

import cn.huanghong.testWEB.entity.UserEntity;

import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-02-13 17:14
 */
public interface IUserService {
    String insert(UserEntity param);

    List<UserEntity>getlist();
}
