package cn.huanghong.testWEB.service.impl;

import cn.huanghong.testWEB.entity.UserEntity;
import cn.huanghong.testWEB.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-02-13 17:15
 */
@Service
@Transactional
public class UserService implements IUserService {

    @Override
    public String insert(UserEntity param) {
        return null;
    }

    @Override
    public List<UserEntity> getlist() {
        return null;
    }
}
