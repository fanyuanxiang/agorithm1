package com.cx.day05;

/*
4、构造方法与重载
	•	 定义一个网络用户类，要处理的信息有用户ID、用户密码、email地址。在建立类的实例时，
	把以上三个信息都作为构造函数的参数输入，其中用户ID和用户密码时必须的，
	缺省的email地址是用户ID加上字符串”@gameschool.com”
 */
public class User {
    long id;
    String username;
    String email;

    public User(long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public User(long id, String username) {
        this.id = id;
        this.username = username;
        this.email=id+"@gameschool.com";
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
