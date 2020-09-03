package com.cx.day05.MainPackage;

import com.cx.day05.Employee;

/*
2.定义Engineer类 继承 Employee类
	•	   1)Engineer类增·专业 属性。分别构建get set方法
	•	   2)定义个无参数构造器，给属性赋默认值。
	•	   3）定义个给基类对象和本类所有属性赋值的构造器。
	•	   4）添加String show() 方法 把基类和本类的所有属性组织成一个字符串返回。
	•	  3.测试类里测试构建Engineer对象，并调用方法。
 */
public class Engineer extends Employee {
    private String profession;

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Engineer(String profession) {
        this.profession = profession;
    }

    public Engineer(String name, int age, String nation, String profession) {
        super(name, age, nation);
        this.profession = profession;
    }
    public void show(){
        System.out.println("Engineer:"+" profession:"+profession +super.toString());
    }


}
