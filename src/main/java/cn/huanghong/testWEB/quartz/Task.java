package cn.huanghong.testWEB.quartz;

import cn.huanghong.testWEB.dao.AliMessageDao;
import cn.huanghong.testWEB.entity.AliMessageEntity;
import cn.huanghong.testWEB.utils.UUIDUtils;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-10-18 10:40
 */
@Component
@EnableScheduling
public class Task {

    @Autowired
    private AliMessageDao aliMessageDao;

    @Scheduled(cron = "* * * * * ?")
    public void insertdata(){
        List<AliMessageEntity> alis = new ArrayList<>();
        String messageid = UUIDUtils.newUUID();
        for(int i=0;i<10;i++){
            AliMessageEntity aliMessageEntity = new AliMessageEntity();
            aliMessageEntity.setUuid(UUIDUtils.newUUID());
            aliMessageEntity.setComment("测试超大数据");
            aliMessageEntity.setCreatetime(new Date());
            aliMessageEntity.setCreateuseruuid("-1");
            aliMessageEntity.setCreateusername("system");
            aliMessageEntity.setUpdatetime(new Date());
            aliMessageEntity.setUpdateuseruuid("-1");
            aliMessageEntity.setUpdateusername("system");
            aliMessageEntity.setGeneratetime(System.currentTimeMillis());
            aliMessageEntity.setMessageid(messageid);
            aliMessageEntity.setMsgsource(1);
            aliMessageEntity.setPayload("实时数据"+i);
            aliMessageEntity.setTopic("demo");
            aliMessageEntity.setIsdeleted(1);
            alis.add(aliMessageEntity);
        }
        aliMessageDao.insertByEntityBatch(alis);
    }
}
