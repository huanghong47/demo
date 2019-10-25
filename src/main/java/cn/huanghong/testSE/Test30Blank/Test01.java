package cn.huanghong.testSE.Test30Blank;

import cn.huanghong.testSE.test09Date.ParamUtil;
import cn.huanghong.testWEB.entity.UserEntity;
import org.springframework.util.StringUtils;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-10-25 19:34
 */
public class Test01 {
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();
        System.out.println(userEntity.toString().trim());
//        if(ParamUtil.isBlank(userEntity)){
//            System.out.println("是空");
//        }else{
//            System.out.println("不是空");
//        }

        if(StringUtils.isEmpty(userEntity)){
            System.out.println("是空");
        }else{
            System.out.println("不是空");
        }
    }
}
