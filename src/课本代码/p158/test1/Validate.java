package 课本代码.p158.test1;

/**
 * 验证用户名和密码类
 * @author mojiangze
 */
public class Validate {
    //定义用户名和密码
    private String user,password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //验证用户名-密码是否正确
    public void login(String user,String password) throws UserNotException,
            PasswordIncorrectException{
       if (!userAccout(user)){
           throw new UserNotException("账号不存在！");
       }else {
           System.out.println("账号⚽️");
       }
        if (!user_password(user,password)){
            throw new PasswordIncorrectException("密码错误！");
        }else {
            System.out.println("登录成功！");
        }

    }

    private boolean user_password(String user, String password) {
        if ((user.equals("zhangsan")) && (password.equals("123"))){
            return true;
        }

        return false;
    }

    private boolean userAccout(String user) {
        if (user.equals("zhangsan")){
            return true;
        }
        return false;
    }
}
