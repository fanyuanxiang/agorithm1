package com.cx.day05;

import java.util.Scanner;

public class TestCompany {
    public static void main(String[] args) {
        Engineer zhangsan = new Engineer(100, "zhangsan", 4000, 1000);
        Manager wanwu = new Manager(102, "wanwu", 2000, 2000);
        Sales lisi = new Sales(101, "lisi", 4000, 2000);
        Employee2[] emps=new Employee2[]{zhangsan,lisi,wanwu};

        Company company = new Company();
        double total = company.calcTotalSalary(emps);
        System.out.println("公司发放薪水总计："+total);
        System.out.println("通过键盘输入类型，1号代表工程师，2号代表项目经理，3号代表销售人员，该员工负责表演,0 代表退出");
        Scanner scanner = new Scanner(System.in);

        boolean flag=true;
        while (flag) {
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    company.play(zhangsan);
                    break;
                case 2:
                    company.play(lisi);
                    break;
                case 3:
                    company.play(wanwu);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("输入有误，请重新输入。。。");
                    break;
            }
        }

    }
}
