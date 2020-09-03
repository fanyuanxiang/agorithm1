package com.cx.day05;
/*
公司类： 计算每个月的开资calcTotalSalary(Empoyee[] employee )，模拟开年会，大家手上会有抽签的号===通过键盘输入类型，1号代表工程师，2号代表项目经理，3号代表销售人员，该员工负责表演
public void play(Employee emp)
 */
public class Company {
    public double calcTotalSalary(Employee2[] employee2){
        double sum=0;
        for (Employee2 e: employee2) {
            sum=sum+e.calcSal(e);
        }
        return sum;
    }
    public void play(Employee2 emp){
        if(emp instanceof Engineer){
            ((Engineer) emp).sing();
        }
        else if(emp instanceof Manager){
            ((Manager) emp).talk();
        }
        else {
            ((Sales)emp).dance();
        }

    }

}
