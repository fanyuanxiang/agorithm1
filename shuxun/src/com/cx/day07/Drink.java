package com.cx.day07;

public abstract class Drink {
    public abstract void  taste();
    final static int COFFE=1;
    final static int BEER=2;
    final static int MILK=3;
    public static Drink  getDrink(int drinkType) throws DrinkNotFoundException{
        if(drinkType<1||drinkType>3){
            throw new DrinkNotFoundException("输入有误！！没有这个饮料。");
        }
        switch (drinkType){
            case 1:
                System.out.println("咖啡");
                return new Coffe();

            case 2:
                System.out.println("啤酒");
                return new Beer();

            case 3:
                System.out.println("牛奶");
                return new Milk();

            default:
                break;
        }
        return null;

    }


}
