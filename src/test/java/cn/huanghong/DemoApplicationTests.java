package cn.huanghong;

import cn.huanghong.testWEB.dao.*;
import cn.huanghong.testWEB.entity.*;
import cn.huanghong.testWEB.utils.UUIDUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sound.midi.Soundbank;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

     @Autowired
     private UserDao userDao;

    @Autowired
     private RoleDao roleDao;

     @Test
     public void test01(){
         List<UserEntity>users = new ArrayList<>();
         UserEntity user1 = new UserEntity("user1");
         UserEntity user2 = new UserEntity("user2");
         UserEntity user3 = new UserEntity("user3");
         UserEntity user4 = new UserEntity("user4");
         users.add(user1);
         users.add(user2);
         users.add(user3);
         users.add(user4);

         userDao.insertbatch(users);

         List<RoleEntity>roles = new ArrayList<>();
         RoleEntity role1 = new RoleEntity("role1",1);
         RoleEntity role2 = new RoleEntity("role2",2);
         RoleEntity role3 = new RoleEntity("role3",3);
         RoleEntity role4 = new RoleEntity("role4",4);
         roles.add(role1);
         roles.add(role2);
         roles.add(role3);
         roles.add(role4);
         roleDao.insertbatch(roles);
     }


     @Test
     public void test02(){
//         List<RoleEntity>roles = roleDao.getlistByuserid(21);
//        UserEntity user = userDao.getuser(21);
         List<UserEntity> list = userDao.getlist();
         System.out.println("-----------");
     }

     @Autowired
     private BanjiDao banjiDao;

     @Test
     public void test03(){
         List<BanjiEntity>bjs = new ArrayList<>();
         for (int i=1;i<11;i++) {
             BanjiEntity bj = new BanjiEntity();
             bj.setUuid(UUIDUtils.newUUID());
             bj.setName(i+"班");
             bjs.add(bj);
         }
         banjiDao.insertbatch(bjs);
     }

     @Autowired
     private XueshengDao xueshengDao;

     @Test
     public void test04(){
         List<XueshengEntity>xss = new ArrayList<>();
         List<BanjiEntity>bjs = banjiDao.getlist();
         int i = 1;
         for (BanjiEntity bj : bjs) {
             for (int j = i; j < i+10; j++) {
                 XueshengEntity xueshengEntity = new XueshengEntity();
                 xueshengEntity.setUuid(UUIDUtils.newUUID());
                 xueshengEntity.setName(String.format("%05d",j)+"号学生");
                 xueshengEntity.setBanjiuuid(bj.getUuid());
                 xss.add(xueshengEntity);
             }
             i = i+10;
         }
         xueshengDao.insertbatch(xss);
     }

     @Autowired
     private ChengjiDao chengjiDao;

     @Test
     public void test05(){
         List<ChengjiEntity>chjs = new ArrayList<>();
         List<XueshengEntity>xss = xueshengDao.getlist(null);
         int i = 1;
         for (XueshengEntity xueshengEntity : xss) {
             for (int j = i; j < i+100; j++) {
                 ChengjiEntity chengjiEntity = new ChengjiEntity();
                 chengjiEntity.setUuid(UUIDUtils.newUUID());
                 chengjiEntity.setFenshu(j+"分");
                 chengjiEntity.setKemu(j+"科目");
                 chengjiEntity.setXueshenguuid(xueshengEntity.getUuid());
                 chjs.add(chengjiEntity);
             }
             i = i+100;
         }
         chengjiDao.insertbatch(chjs);
     }

     @Test
     public void test06(){
         Map<String,Object>param = new HashMap<>();
//         param.put("uuid","f5a2fc2f6f6f4ad7a675013f3524bfff");
         List<XueshengEntity>xss = xueshengDao.getlist(param);
         System.out.println("11111111111111");
     }


     @Autowired
     private AliMessageDao aliMessageDao;

     @Test
     public void test07(){
         List<AliMessageEntity>alis = new ArrayList<>();
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

