package cn.huanghong.testWEB.dao;

import cn.huanghong.testWEB.entity.XueshengEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-07-01 10:50
 */
@Repository
@Mapper
public interface XueshengDao {
    void insertbatch(List<XueshengEntity> xss);
    List<XueshengEntity>getlist(Map<String,Object> param);
    XueshengEntity getone(String uuid);
}
