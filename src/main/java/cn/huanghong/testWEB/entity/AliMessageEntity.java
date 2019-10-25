package cn.huanghong.testWEB.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: boccasecurityofproductionplatformbackside
 * @description: 阿里消息(https://help.aliyun.com/document_detail/87254.html?spm=a2c4g.11174283.6.556.3a8b1668ieNoxJ)
 * @author: huanghong
 * @date: 2019-06-26 09:30
 */
@Data
@NoArgsConstructor
public class AliMessageEntity extends BaseEntity {
    /**
     * 物联网平台生成的消息ID
     */
    private String messageid;
    /**
     * 消息来源Topic
     */
    private String topic;
    /**
     * 0：消息最多投递1次。
     * 1：消息最少投递1次。
     */
    private int qos;
    /**
     * 	消息生成时间戳，以毫秒表示
     */
    private long generatetime;
    /**
     * 消息数据（解析后）
     */
    private String payload;

    /**
     * 数据来源
     */
    private Integer msgsource;
}
