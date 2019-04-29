package domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @ProjectName: mybatis1
 * @Package: domain
 * @ClassName: user
 * @Description:
 * @Author: zengyanbo
 * @CreateDate: 2019-04-28 18:03
 * @UpdateDate: 2019-04-28 18:03
 * @Version: 1.0
 */

public class user implements Serializable {
    private int id;
    private String name;
    private Date birthday;
    private char sex;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                '}';
    }
}
