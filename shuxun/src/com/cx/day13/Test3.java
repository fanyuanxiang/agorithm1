package com.cx.day13;

import java.util.HashSet;

public class Test3 {
    //3、在HashSet集合中添加三个Person对象，把姓名相同的人当作同一个人，禁止重复添加。添加完成之后以两种遍历方式输出


    public static void main(String[] args) {
        Person p1 = new Person("zhangsan", 18);
        Person p2 = new Person("lisi",19);
        Person p3 = new Person("lisi",17);
        //添加的对象认定同名对象为同一个人，禁止重复添加
        //复写hPerson 的ashcode方法，指定对象属性的名字。
        HashSet<Person> people = new HashSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        for (Person p :
                people) {
            System.out.println(p);
        }



    }
}
