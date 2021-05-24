package 课本代码.p158.test1;

/**
 * 密码错误异常--自定义
 * @author mojiangze
 */
public class PasswordIncorrectException extends Exception{
    public PasswordIncorrectException() {
    }

    public PasswordIncorrectException(String message) {
        super(message);
    }
}
