package 课本代码.p158.test1;

/**
 * @author mojiangze
 */
public class MainLogin {
    public static void main(String[] args) {
        Validate validate=new Validate();


        try {
            validate.login("zhangsan","123");
        } catch (UserNotException | PasswordIncorrectException e) {
            e.printStackTrace();
        }
    }
}
