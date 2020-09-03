package cn.entity;


import cn.service.ServicePackage;

public class MobileCard {
    private String cardNumber;  //卡号
    private String username;    //用户名
    private String password;    //密码
    private ServicePackage serPackage;  //所属套餐
    private double consumAmount;//当月消费金额
    private double money;       //账户余额
    private int realTalkTime;   //当月实际通话时长
    private int realSMSCount;   //当月实际发送短信条数
    private int realFlow;       //当月实际上网流量

    public MobileCard() {
    }

    public MobileCard(String cardNumber, String username, String password, ServicePackage serPackage, double money) {
        this.cardNumber = cardNumber;
        this.username = username;
        this.password = password;
        this.serPackage = serPackage;
        this.money = money;
    }

    public MobileCard(String cardNumber, String username, String password, ServicePackage serPackage, double consumAmount, double money, int realTalkTime, int realSMSCount, int realFlow) {
        this.cardNumber = cardNumber;
        this.username = username;
        this.password = password;
        this.serPackage = serPackage;
        this.consumAmount = consumAmount;
        this.money = money;
        this.realTalkTime = realTalkTime;
        this.realSMSCount = realSMSCount;
        this.realFlow = realFlow;
    }

    //卡号
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    //用户名
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    //密码
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    //所属套餐
    public ServicePackage getSerPackage() {
        return serPackage;
    }
    public void setSerPackage(ServicePackage serPackage) {
        this.serPackage = serPackage;
    }

    //账户余额
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }

    //当月消费金额
    public double getConsumAmount() {
        return consumAmount;
    }
    public void setConsumAmount(double consumAmount) {
        this.consumAmount = consumAmount;
    }

    //当月实际通话时长
    public int getRealTalkTime() {
        return realTalkTime;
    }
    public void setRealTalkTime(int realTalkTime) {
        this.realTalkTime = realTalkTime;
    }

    //当月实际发送短信条数
    public int getRealSMSCount() {
        return realSMSCount;
    }
    public void setRealSMSCount(int realSMSCount) {
        this.realSMSCount = realSMSCount;
    }

    //当月实际上网流量
    public int getRealFlow() {
        return realFlow;
    }
    public void setRealFlow(int realFlow) {
        this.realFlow = realFlow;
    }

    public void showMsg(){
        System.out.println("卡号："+this.cardNumber+"，用户名："+this.username+"，当前余额："+this.money+"元");
        this.serPackage.showInfo();
    }

}