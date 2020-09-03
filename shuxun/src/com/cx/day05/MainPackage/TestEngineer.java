package com.cx.day05.MainPackage;

public class TestEngineer {
    public static void main(String[] args) {
        Engineer engineer = new Engineer("developer");
        engineer.show();
        Engineer engineer1 = new Engineer("fanyuanxiang", 20, "汉族", "developer");
        engineer1.show();
    }
}
