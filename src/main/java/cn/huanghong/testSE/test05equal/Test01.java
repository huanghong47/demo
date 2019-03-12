package cn.huanghong.testSE.test05equal;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-02-28 16:45
 */
public class Test01 {
    public static void main(String[] args) {
        User user = new User(444,444L);
        if(user.getId().equals(444)){
            System.out.println("1111");
        }
        if(user.getUid().equals(444L)){
            System.out.println("2222");
        }
        if(user.getId()==444){
            System.out.println("3333");
        }
        if(user.getUid()==444){
            System.out.println("4444");
        }
    }
}
