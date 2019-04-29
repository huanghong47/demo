package cn.huanghong.testSE.test14List;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-04-23 14:27
 */
public class Test01 {
    public static void main(String[] args) {
        List<Integer> dataList = new ArrayList<Integer>();
        for(int i=0;i<12888;i++)
            dataList.add(i);

//分批处理
        if(null!=dataList&&dataList.size()>0){
            int pointsDataLimit = 1000;//限制条数
            Integer size = dataList.size();
//判断是否有必要分批
            if(pointsDataLimit<size){
                int part = size/pointsDataLimit;//分批数
                System.out.println("共有 ： "+size+"条，！"+" 分为 ："+part+"批");
//
                for (int i = 0; i < part; i++) {
//1000条
                    List<Integer> listPage = dataList.subList(0, pointsDataLimit);
                    System.out.println(listPage);
//剔除
                    dataList.subList(0, pointsDataLimit).clear();
                }

                if(!dataList.isEmpty()){
                    System.out.println(dataList);//表示最后剩下的数据
                }
            }else{
                System.out.println(dataList);
            }
        }else{
            System.out.println("没有数据!!!");
        }
    }
}
