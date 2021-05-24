package 课本代码.p158.test1;

/**
 * 账号不存在异常 --自定义
 * @author mojiangze
 */
public class UserNotException extends Exception{
    public UserNotException() {
    }

    public UserNotException(String message) {
        super(message);
    }
}
