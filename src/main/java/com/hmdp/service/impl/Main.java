package com.hmdp.service.impl;

import java.util.Scanner;

public class Main {

    private static final RobotService robotService = new QkyRobotServiceImpl();


    public static void main(String[] args)throws Exception {

            Scanner scanner = new Scanner(System.in);
        System.out.println("尊敬的C站大佬，请给我取个响亮的名字！！");
        System.out.println("-------------------------------");
        String name = scanner.nextLine();
        System.out.println("大佬好,我是大数据小禅博客里的机器人，直接给我下达指令哦~");
        System.out.println("-------------------------------");
        while (true){

            String input = scanner.nextLine();
            if("88".equalsIgnoreCase(input)){
                System.out.println("欢迎下次使用，拜拜");
                break;
            }else {
                Response response = robotService.qa(input);
                if(response != null && response.getCode() == 0){
                    System.out.println("-------------------------------");
                    System.out.println(name+":"+ new String(response.getContent().getBytes(),"UTF-8"));
                    System.out.println("-------------------------------");
                }else {
                    System.out.println(name+": 大佬你刚刚这句话我没听懂，可否再陈述一次~");
                }
            }

        }
        scanner.close();


    }
}
