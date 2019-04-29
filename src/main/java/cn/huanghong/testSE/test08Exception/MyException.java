package cn.huanghong.testSE.test08Exception;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-03-27 14:42
 */
public class MyException extends RuntimeException{
    private String code;
    private String msg;
    private Object data;
    private Long count;


    public MyException(String msg) {
        super(msg);
        this.msg = msg;
    }
    public MyException(String code, String msg, Object data, Long count) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.count = count;
    }


}
