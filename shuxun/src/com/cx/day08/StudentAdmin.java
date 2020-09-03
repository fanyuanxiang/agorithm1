package com.cx.day08;

import java.util.Scanner;

public class StudentAdmin {
        String msg = "\t 编号 \t 姓名 \t 年龄 \tjava\tcsharp\thtml\tsql\t 总分 \t 平均 分";
    public void print(Student[] stu) {
        for (Student s : stu) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }

    public void addStudent(String name, int age, Student[] stu) {
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        int i = this.getIndex(stu);
        if (i == 999) {
            System.out.println("这个数组已经满了，无法再添加数据。。。");
            return;
        } else {
            student.setId(i);
            stu[i] = student;
        }

    }

    // 获取编号
    public int getIndex(Student[] stu) {
        for (int i = 0; i < stu.length; i++) {
            if (stu[i] == null) {
                return i;
            }
        }
        return 999;
    }

    public boolean exits(int id, Student student) {
        if (student!= null) {
            if (student.getId() == id) {
                return true;
            } else{
                return false;
            }
        }
        return false;
    }

    public void selectStudent(int id ,Student[] stu){
        System.out.println(msg);
        int index = this.getIndex(stu);
        if(index!=0){
            for (int i = 0; i < index ; i++) {
                if (this.exits(id,stu[i])){
                    System.out.println(stu[i]);
                    return;
                }
            }
        }
        System.out.println("这个学生不存在。。。");
    }

    // 更新学生信息

    public void updateStudent(int id, String name, int age, Student[] stu) {
        for (int i = 0; i < stu.length; i++) {
            if (stu[i] != null) {
                if (this.exits(id, stu[i])) {
                    if (stu[i].getId() == id) {
                        stu[i].setName(name);
                        stu[i].setAge(age);
                        System.out.println("-- 更新学生信息成功 --");
                        return;
                    }
                }
            }
        }
        System.out.println(" 该学生不存在！！！");
    }

    public void deleteStudent(int id, Student[] stu) {
        for (int i = 0; i < stu.length; i++) {
            if (this.exits(id, stu[i])) {
                stu[i] = null;
                this.print(stu);
                System.out.println("\t-- 删除学生成功 --");
                return;
            }
        }
        System.out.println(" 删除学生失败 ");
    }
    // 根据学生编号获取学生姓名

    public String getName(int id, Student[] stu) {
        for (int i = 0; i < stu.length; i++) {
            if (this.exits(id, stu[i])) {
                return stu[i].getName();
            }
        }
        return null;
    }
    // 根据学生编号输入学生成绩

    public void inputScore(int id, Student[] stu, Scanner input) {
        String name = this.getName(id, stu);
        System.out.println(" 请输入 " + name + " 的java 成绩： ");
        int java = input.nextInt();
        System.out.println(" 请输入 " + name + " 的csharp 的成绩： ");
        int csharp = input.nextInt();
        System.out.println(" 请输入 " + name + " 的html 的成绩： ");
        int html = input.nextInt();
        System.out.println(" 请输入 " + name + " 的sql 的成绩： ");
        int sql = input.nextInt();
        for (int i = 0; i < stu.length; i++) {
            if (this.exits(id, stu[i])) {
                stu[i].setJava(java);
                stu[i].setCsharp(csharp);
                stu[i].setHtml(html);
                stu[i].setSql(sql);
                stu[i].setSum();
                stu[i].setAvg();
                break;
            }
        }
        this.print(stu);
    }
    // 指定某门课的成绩排序

    public void scoreSort(int num, Student[] stu) {
        Student[] arr = stu;
        if (num == 1) {
            for (int i = 0; i < stu.length - 1; i++) {
                for (int j = i + 1; j < stu.length; j++) {
                    if (stu[i] != null && stu[j] != null) {
                        if (stu[i].getJava() < stu[j].getJava()) {
                            Student s = arr[i];
                            arr[i] = arr[j];
                            arr[j] = s;
                        }
                    }
                }
            }
            this.print(arr);
        } else if (num == 2) {
            for (int i = 0; i < stu.length - 1; i++) {
                for (int j = i + 1; j < stu.length; j++) {
                    if (stu[i] != null && stu[j] != null) {
                        if (stu[i].getCsharp() < stu[j].getCsharp()) {
                            Student s = arr[i];
                            arr[i] = arr[j];
                            arr[j] = s;
                        }
                    }
                }
            }
            this.print(arr);
        } else if (num == 3) {
            for (int i = 0; i < stu.length - 1; i++) {
                for (int j = i + 1; j < stu.length; j++) {
                    if (stu[i] != null && stu[j] != null) {
                        if (stu[i].getHtml() < stu[j].getHtml()) {
                            Student s = arr[i];
                            arr[i] = arr[j];
                            arr[j] = s;
                        }
                    }
                }
            }
            this.print(arr);
        } else if (num == 4) {
            for (int i = 0; i < stu.length - 1; i++) {
                for (int j = i + 1; j < stu.length; j++) {
                    if (stu[i] != null && stu[j] != null) {
                        if (stu[i].getSql() < stu[j].getSql()) {
                            Student s = arr[i];
                            arr[i] = arr[j];
                            arr[j] = s;
                        }
                    }
                }
            }
            this.print(arr);
        }
    }

    // 总分排序
    public void sumSort(Student[] stu) {
        Student[] arr = stu;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != null && arr[j] != null) {
                    if (arr[i].getSum() < arr[j].getSum()) {
                        Student s = arr[j];
                        arr[j] = arr[i];
                        arr[i] = s;
                    }
                }
            }
        }
        this.print(arr);
    }


}
