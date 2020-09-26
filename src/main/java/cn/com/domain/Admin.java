package cn.com.domain;

/**
 * @ClassName Admin
 * @Description TODO
 * @Author zhaojing
 * @Date 2019/10/27 16:41
 * @Version 1.0
 */
public class Admin {

    private String uname="小猪佩奇";
    private String gender = "雌性";

    public Admin() {
    }

    public Admin(String uname, String gender) {
        this.uname = uname;
        this.gender = gender;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "uname='" + uname + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
