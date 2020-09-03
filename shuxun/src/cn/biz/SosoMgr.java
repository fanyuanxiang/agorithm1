package cn.biz;

import cn.utils.CardUtil;

import java.util.Scanner;

public class SosoMgr {
    Scanner input = new Scanner(System.in);
     CardUtil utils = new CardUtil();

             public static void main(String[] args) {
                 SosoMgr soso = new SosoMgr();
                 soso.mainMenu();
                 System.out.println("谢谢使用！");
             }

           /**
        * 主流程
        */
               public void mainMenu() {
                   int menuChoose = 0;
                   String mobileNumber = "";
                   String password = "";
                   utils.init();
                   utils.initScenes();
                   //Common.typesInit();
                   do {
                       System.out.println("\n*************欢迎使用嗖嗖移动业务大厅***************");
                       System.out.println("1.用户登录   2.用户注册   3.使用嗖嗖   4.话费充值  5.资费说明  6.退出系统");
                       System.out.print("请选择：");
                       menuChoose = input.nextInt();
                       // 分支语句：根据功能编号执行相应功能
                       switch (menuChoose) {
                           case 1:
                               //用户登录
                               System.out.print("请输入手机卡号：");
                               mobileNumber = input.next();
                               System.out.print("请输入密码：");
                               password = input.next();
                               if (utils.isExistCard(mobileNumber, password)) {
                                   cardMenu(mobileNumber);
                               } else {
                                   System.out.println("对不起，您输入的信息有误，无法登录！");
                               }
                               continue;
                           case 2:
                               //用户注册
                               registCard();
                               continue;
                           case 3:

                               //使用嗖嗖
                               System.out.print("请输入手机卡号：");
                               mobileNumber = input.next();

                               if (utils.isExistCard(mobileNumber, password)) {
                                   try {
                              /*                        System.out.println("****使用之前****");
                        utils.showRemainDetail(mobileNumber);
                          utils.showAmountDetail(mobileNumber);*/
                                       utils.userSoso(mobileNumber);
                                   } catch (Exception e) {
                                       System.err.println(e.getMessage());
                                   }
                               } else {
                                   System.out.println("对不起，该卡号未注册，不能使用！");
                               }

                                      /*System.out.println("****使用之后****");
                   utils.showRemainDetail(mobileNumber);
                   utils.showAmountDetail(mobileNumber);*/
                               continue;
                           case 4:
                               //话费充值
                               System.out.print("请输入充值卡号：");
                               mobileNumber = input.next();
                               if (utils.isExistCard(mobileNumber, password)) {
                                   System.out.print("请输入充值金额：");
                                   double money = input.nextDouble();
                                   utils.chargeMoney(mobileNumber, money);
                               } else {
                                   System.out.println("对不起，要充值的卡号未注册，无法充值！");
                               }
                               continue;
                           case 5:
                               System.out.println("\n*****资费说明******");
                               utils.showDescription();
                               continue;
                           case 6:
                               //退出系统
                               break;
                           default:
                               //选择其他数字退出系统
                               break;
                       }
                       break;
                   } while (true);
               }

    private void registCard() {
    }

    private void cardMenu(String mobileNumber) {
    }
}
