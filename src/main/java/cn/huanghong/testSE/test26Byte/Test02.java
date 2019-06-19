package cn.huanghong.testSE.test26Byte;

import cn.huanghong.testSE.test09Date.ParamUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-06-14 10:34
 */
public class Test02 {
    public static final String COMMAND_START = "0xfe"; //通讯起始位
    public static final String  COMMAND_END = "0xff"; //通讯结束位
    public static final String  COMMAND_SET = "0x01"; //属性设置
    public static final String  COMMAND_REPORT_REPLY = "0x02"; //上报数据返回结果
    public static final String  COMMAND_SET_REPLY = "0x03"; //属性设置设备返回结果
    public static final String  COMMAD_XUNJIAN = "0x64";    //巡检命令
    public static final String  COMMAD_HUOJING = "0x6e";    //火警110
    public static final String  COMMAD_GUZHANG = "0x6f";    //故障111
    public static final String  COMMAD_QIDONG = "0x70";    //启动112
    public static final String  COMMAD_FANKUI = "0x71";    //反馈113
    public static final String  COMMAD_JIANGUAN = "0x72";    //监管114
    public static final String  COMMAD_PINGBI = "0x73";    //屏蔽115
    public static final String  COMMAD_YULIU = "0x74";    //预留116
    public static final String  COMMAD_PEIZHI1 = "0x67";    //外设读取控制器回路总数、多线总数、层显总数以及各回路节点数的配置
    public static final String  COMMAD_PEIZHI2 = "0x68";    //外设读取控制器各回路节点的属性配置
    public static final String  COMMAD_CHONGQI = "0x00";    //控制器重新启动信息
    public static final String  COMMAD_XIAOYIN = "0xcb";    //消音
    public static final String  COMMAD_JIOASHI = "0xcc";    //校时
    public static final String  ALINK_PROP_REPORT_METHOD = "thing.event.property.post"; //标准ALink JSON格式topic， 设备上传属性数据到云端
    public static final String  ALINK_PROP_SET_METHOD = "thing.service.property.set"; //标准ALink JSON格式topic， 云端下发属性控制指令到设备端
    public static final String  ALINK_PROP_SET_REPLY_METHOD = "thing.service.property.set"; //标准ALink JSON格式topic, 设备上报属性设置的结果到云端
    public static final Integer  CONST_LENTH = 32;    //每一点的字节数

    public static final HashMap<Integer,String> msgTypeArrayMap = new HashMap<Integer,String>(){{
        put(100,"巡检");
        put(110,"火警");
        put(111,"故障");
        put(112,"启动");
        put(113,"反馈");
        put(114,"监管");
        put(115,"屏蔽");
        put(116,"预留");
    }
    };

    public static final HashMap<Integer,String> equipmentTypeArrayMap = new HashMap<Integer,String>(){{
        put(0, "感烟探头");
        put(1, "感温探头");
        put(2, "差温探头");
        put(3, "剩余电流");
        put(4, "电气测温");
        put(5, "手动按钮");
        put(6, "消火栓钮");
        put(7, "感温电缆");
        put(8, "感温光纤");
        put(9, "红外光束");
        put(10, "压力开关");
        put(11, "可燃气体 ");
        put(12, "水流指示");
        put(13, "输入模块");
        put(14, "火灾显示");
        put(15, "并联探头");
        put(16, "传感器２");
        put(17, "传感器３");
        put(18, "传感器４");
        put(19, "传感器５");
        put(20, "输入输出");
        put(21, "脉冲方式");
        put(22, "自动方式");
        put(23, "自动脉冲");
        put(24, "消防广播");
        put(25, "消防警铃");
        put(26, "声光报警");
        put(27, "新风机");
        put(28, "照明切断");
        put(29, "动力切断");
        put(30, "防排烟阀");
        put(31, "正压风阀");
        put(32, "卷帘半降");
        put(33, "卷帘全降");
        put(34, "消防警笛");
        put(35, "排烟风机");
        put(36, "防火阀");
        put(37, "防火门");
        put(38, "空调切断");
        put(39, "正压风机");
        put(40, "消防水幕");
        put(41, "电梯迫降");
        put(42, "信号蝶阀");
        put(43, "应急照明");
        put(44, "其它０２");
        put(45, "其它０３");
        put(46, "其它０４");
        put(47, "其它０５");
        put(48, "其它０６");
        put(49, "其它０７");
        put(50, "其它０８");
        put(51, "其它０９");
        put(52, "其它１０");
        put(53, "其它１１");
        put(54, "多线模块");
        put(55, "气体灭火");
    }};

    public static final HashMap<Integer,String> msgStatusArray1Map = new HashMap<Integer,String>(){{
        put(1, "火警");
        put(2, "监管报警");
        put(3, "屏蔽");
        put(7, "模块启动");
        put(8, "故障");
        put(16, "回路板上通讯故障");
        put(78, "短路");
        put(79, "开路");
        put(83, "气体控制板通讯故障");
        put(196, "应急广播故障");
    }};

    public static final HashMap<Integer,String> msgStatusArray2Map = new HashMap<Integer,String>(){{
        put(1, "启动");
        put(2, "反馈");
        put(3, "启动并反馈");
        put(8, "故障");
    }};

    public static final HashMap<Integer,String> msgStatusArray3Map = new HashMap<Integer,String>(){{
        put(0, "面板信号");
        put(1, "现场信号");
        put(2, "火警信号");
        put(3, "面板喷洒");
        put(4, "现场喷洒");
        put(5, "火警喷洒");
        put(6, "面板启动");
        put(7, "现场启动");
        put(8, "火警启动");
        put(9, "不明启动");
    }};

    public static final HashMap<Integer,String> msgDetailArrayArrayMap = new HashMap<Integer,String>(){{
        put(0, "面板按钮发出启动信号");
        put(1, "现场按钮发出启动信号");
        put(2, "火警信号发出启动信号");
        put(3, "面板按钮发出喷洒信号");
        put(4, "现场按钮发出喷洒信号");
        put(5, "火警信号发出喷洒信号");
        put(6, "面板启动按钮启动喷洒");
        put(7, "现场启动按钮启动喷洒");
        put(8, "火灾报警信号启动喷洒");
        put(9, "不明控制信号启动喷洒");
        put(10, "气体声光报警器＿动作");
        put(11, "气体声光报警器＿故障 ");
        put(12, "气体喷洒警告灯＿动作");
        put(13, "气体喷洒警告灯＿故障");
        put(14, "气体灭火＿瓶头阀动作");
        put(15, "气体灭火＿瓶头阀故障");
        put(16, "气体灭火＿启动阀动作");
        put(17, "气体灭火＿启动阀故障");
        put(18, "气体灭火控制模块动作");
        put(19, "气体灭火控制模块故障");
        put(20, "气体现场控制盘＿故障");
        put(21, "面板启动＿声光报警器");
        put(22, "面板启动＿喷洒警告灯");
        put(23, "面板启动＿＿＿瓶头阀");
        put(24, "面板启动＿＿＿启动阀");
        put(25, "面板启动＿＿控制模块");
        put(26, "现场启动＿声光报警器");
        put(27, "现场启动＿喷洒警告灯");
        put(28, "现场启动＿＿＿瓶头阀");
        put(29, "现场启动＿＿＿启动阀");
        put(30, "现场启动＿＿控制模块");
        put(31, "火警启动＿声光报警器");
        put(32, "火警启动＿喷洒警告灯");
        put(33, "火警启动＿＿＿瓶头阀");
        put(34, "火警启动＿＿＿启动阀");
        put(35, "火警启动＿＿控制模块");
        put(36, "不明启动＿声光报警器");
        put(37, "不明启动＿喷洒警告灯");
        put(38, "不明信号启动＿瓶头阀");
        put(39, "不明信号启动＿启动阀");
        put(40, "不明信号启动控制模块");
    }};

    public  static String getBytemsg(String value) throws UnsupportedEncodingException {
        //对原始数据进行转换
        List<String> values = new ArrayList<>();
        for(int i = 0;i<value.length();i=i+2){
            String s = value.substring(i,i+2);
            values.add(s);
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (String s : values) {
            stringBuffer.append("0x");
            stringBuffer.append(s);
            stringBuffer.append(",");
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        return stringBuffer.toString();
    }

    public static String sub16(String value){
        return value.substring(2,value.length());
    }

    public static String rawDataToProtocol(String orivalue) {
        try {
            JSONObject jsonMap = new JSONObject();
            JSONObject params = new JSONObject();

            String bytevalue = getBytemsg(orivalue);
            String[] valuearray = bytevalue.split(",");
            String fHead = valuearray[0]; // 数据起始位
            String fEnd = valuearray[valuearray.length -1]; // 数据结束位

            if (fHead.equalsIgnoreCase(COMMAND_START)  && fEnd.equalsIgnoreCase(COMMAND_END)) {
                jsonMap.put("method",ALINK_PROP_REPORT_METHOD);
                jsonMap.put("version","1.0");
                jsonMap.put("sensorType","jb3208");
                jsonMap.put("id","1");

                params.put("prop_machine1",Integer.parseInt(sub16(valuearray[1]),16));
                params.put("prop_msgType",Integer.parseInt(sub16(valuearray[2]),16));
                params.put("prop_msgTypeDesc",ParamUtil.isNotBlank(msgTypeArrayMap.get(params.get("prop_msgType")))?msgTypeArrayMap.get(params.get("prop_msgType")):"缺省");
                params.put("prop_msgLength",Integer.parseInt(sub16(valuearray[4])+sub16(valuearray[3]),16));
                String prop_msgTypehex = "0x"+Integer.toHexString(params.getInteger("prop_msgType"));
                if (prop_msgTypehex.equalsIgnoreCase(COMMAD_HUOJING)
                        ||prop_msgTypehex.equalsIgnoreCase(COMMAD_GUZHANG)
                        ||prop_msgTypehex.equalsIgnoreCase(COMMAD_QIDONG)
                        ||prop_msgTypehex.equalsIgnoreCase(COMMAD_FANKUI)
                        ||prop_msgTypehex.equalsIgnoreCase(COMMAD_JIANGUAN)
                        ||prop_msgTypehex.equalsIgnoreCase(COMMAD_PINGBI)
                        ||prop_msgTypehex.equalsIgnoreCase(COMMAD_YULIU)){
                    //*火警110故障111启动112反馈113*监管114屏蔽115预留116
                    //信息体详情
                    params.put("prop_total",Integer.parseInt(sub16(valuearray[6])+sub16(valuearray[5]),16));
                    JSONArray msgs = new JSONArray();
                    for (int index =0;index <params.getInteger("prop_total");index++)
                    {
                        JSONObject msgTmp = new JSONObject();
                        String prop_year = "";
                        String prop_month= "";
                        String prop_day= "";
                        String prop_hour= "";
                        String prop_minute= "";
                        String prop_msgDetailTmp= "";
                        msgTmp.put("prop_machine2",padNumber(Integer.parseInt(sub16(valuearray[7+CONST_LENTH*index]),16),2));
                        msgTmp.put("prop_line",padNumber(Integer.parseInt(sub16(valuearray[8+CONST_LENTH*index]),16),2));
                        msgTmp.put("prop_point",padNumber(Integer.parseInt(sub16(valuearray[9+CONST_LENTH*index]),16),3));
                        msgTmp.put("prop_zone",padNumber(Integer.parseInt(sub16(valuearray[11+CONST_LENTH*index])+sub16(valuearray[10+CONST_LENTH*index]),16),4));
                        msgTmp.put("prop_equipmentType",Integer.parseInt(sub16(valuearray[12+CONST_LENTH*index]),16));
                        msgTmp.put("prop_equipmentTypeDesc",ParamUtil.isNotBlank(equipmentTypeArrayMap.get(msgTmp.get("prop_equipmentType")))?equipmentTypeArrayMap.get(msgTmp.get("prop_equipmentType")):"缺省");
                        msgTmp.put("prop_msgStatus",Integer.parseInt(sub16(valuearray[13+CONST_LENTH*index]),16));
                        msgTmp.put("prop_msgStatusDesc",ParamUtil.isNotBlank(msgStatusArray1Map.get(msgTmp.get("prop_msgStatus")))?msgStatusArray1Map.get(msgTmp.get("prop_msgStatus")):"缺省");

                        if(Integer.parseInt(msgTmp.getString("prop_line")) == 0 && (Integer.parseInt(msgTmp.getString("prop_point")) >= 0 && Integer.parseInt(msgTmp.getString("prop_point")) <= 252)){
                            //当回路为0时，点号1- 252
                            msgTmp.put("prop_msgStatusDesc",ParamUtil.isNotBlank(msgStatusArray2Map.get(msgTmp.get("prop_msgStatus")))?msgStatusArray2Map.get(msgTmp.get("prop_msgStatus")):"缺省");
                        }
                        if(Integer.parseInt(msgTmp.getString("prop_line")) >= 200 && (Integer.parseInt(msgTmp.getString("prop_point")) >= 0 && Integer.parseInt(msgTmp.getString("prop_point")) <= 207)){
                            //当回路为200- 207
                            msgTmp.put("prop_msgStatusDesc",ParamUtil.isNotBlank(msgStatusArray3Map.get(msgTmp.get("prop_msgStatus")))?msgStatusArray3Map.get(msgTmp.get("prop_msgStatus")):"缺省");
                        }
                        prop_year = sub16(valuearray[14+CONST_LENTH*index]);
                        prop_month = sub16(valuearray[15+CONST_LENTH*index]);
                        prop_day = sub16(valuearray[16+CONST_LENTH*index]);
                        prop_hour = sub16(valuearray[17+CONST_LENTH*index]);
                        prop_minute = sub16(valuearray[18+CONST_LENTH*index]);
                        msgTmp.put("prop_time",20+padNumber(Integer.parseInt(prop_year),2)
                                +padNumber(Integer.parseInt(prop_month),2)
                                +padNumber(Integer.parseInt(prop_day),2)
                                +padNumber(Integer.parseInt(prop_hour),2)
                                +padNumber(Integer.parseInt(prop_minute),2));
                        prop_msgDetailTmp = sub16(valuearray[19+CONST_LENTH*index]);
                        msgTmp.put("prop_msgDetail",msgTmp.get("prop_line")+"回路"+msgTmp.get("prop_point")+"号");
                        if(Integer.parseInt(msgTmp.getString("prop_line")) >= 200 && (Integer.parseInt(msgTmp.getString("prop_point")) >= 0 && Integer.parseInt(msgTmp.getString("prop_point")) <= 207)){
                            //当回路为200- 207
                            msgTmp.put("prop_msgDetail",ParamUtil.isNotBlank(msgDetailArrayArrayMap.get(msgTmp.get("prop_msgDetailTmp")))?msgDetailArrayArrayMap.get(msgTmp.get("prop_msgDetailTmp")):"缺省");
                        }
                        msgs.add(msgTmp);
                    }
                    params.put("msgs",msgs);
                }else if(prop_msgTypehex.equalsIgnoreCase(COMMAD_PEIZHI2)){
                    //*外设读取控制器各回路节点的属性配置
                    //信息体详情
                    params.put("prop_total",Integer.parseInt(sub16(valuearray[6])+sub16(valuearray[5]),16));
                    JSONArray msgs = new JSONArray();
                    for (int index=0;index <params.getInteger("prop_total");index++)
                    {
                        JSONObject msgTmp = new JSONObject();
                        String prop_year = "";
                        String prop_month= "";
                        String prop_day= "";
                        String prop_hour= "";
                        String prop_minute= "";

                        msgTmp.put("prop_machine2",Integer.parseInt(sub16(valuearray[7+CONST_LENTH*index]),16));
                        msgTmp.put("prop_line",Integer.parseInt(sub16(valuearray[8+CONST_LENTH*index]),16));
                        msgTmp.put("prop_point",Integer.parseInt(sub16(valuearray[9+CONST_LENTH*index]),16));
                        msgTmp.put("prop_zone",Integer.parseInt(sub16(valuearray[11+CONST_LENTH*index])+sub16(valuearray[10+CONST_LENTH*index]),16));
                        msgTmp.put("prop_equipmentType",Integer.parseInt(sub16(valuearray[12+CONST_LENTH*index]),16));
                        msgTmp.put("prop_equipmentTypeDesc",ParamUtil.isNotBlank(equipmentTypeArrayMap.get(msgTmp.get("prop_equipmentType")))?equipmentTypeArrayMap.get(msgTmp.get("prop_equipmentType")):"缺省");
                        msgTmp.put("prop_msgStatus",Integer.parseInt(sub16(valuearray[13+CONST_LENTH*index]),16));
                        msgTmp.put("prop_msgStatusDesc",ParamUtil.isNotBlank(msgStatusArray1Map.get(msgTmp.get("prop_msgStatus")))?msgStatusArray1Map.get(msgTmp.get("prop_msgStatus")):"缺省");

                        //原始数据就是十进制-start
                        prop_year = sub16(valuearray[14+CONST_LENTH*index]);
                        prop_month = sub16(valuearray[15+CONST_LENTH*index]);
                        prop_day = sub16(valuearray[16+CONST_LENTH*index]);
                        prop_hour = sub16(valuearray[17+CONST_LENTH*index]);
                        prop_minute = sub16(valuearray[18+CONST_LENTH*index]);
                        msgTmp.put("prop_time",20+padNumber(Integer.parseInt(prop_year),2)
                                +padNumber(Integer.parseInt(prop_month),2)
                                +padNumber(Integer.parseInt(prop_day),2)
                                +padNumber(Integer.parseInt(prop_hour),2)
                                +padNumber(Integer.parseInt(prop_minute),2));
                        //原始数据就是十进制-end
                        msgs.add(msgTmp);
                    }
                }
            }
            jsonMap.put("params",params);
            return jsonMap.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

    //指定位数补0
    public static String padNumber(Integer value,int weishu){
      if(String.valueOf(value).length()<weishu){
          StringBuffer sb = new StringBuffer();
          for(int i = 0;i<weishu-String.valueOf(value).length();i++){
              sb.append("0");
          }
          return sb.toString()+value;
      }else{
          return String.valueOf(value);
      }
    }

    public static void main(String[] args) {
        System.out.println(rawDataToProtocol("fe016401006456dbff"));
        System.out.println("=========================");
        System.out.println(rawDataToProtocol("FE016F42000200014D020000000819050814580000000000000000000000000000000000000000014D0100000008190508150000000000000000000000000000000000000000008573FF"));
    }

}
