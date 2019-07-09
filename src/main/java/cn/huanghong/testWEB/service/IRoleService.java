package cn.huanghong.testWEB.service;

import cn.huanghong.testWEB.entity.RoleEntity;
import cn.huanghong.testWEB.entity.UserEntity;

import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-06-27 10:30
 */
public interface IRoleService {
    String insert(RoleEntity param);
    List<RoleEntity>getlist();
}
