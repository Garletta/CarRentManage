package CCZU;

import java.util.ArrayList;
import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {

        //初始化车库信息
        Scanner sc = new Scanner(System.in);
        Garage garage = new Garage();
        garage.init();
        CCZUBus carChoose = new CCZUBus();

        System.out.println("**********欢迎使用 CCZU 租车服务系统**********");
        System.out.println("1.轿车    2.客车    ");
        System.out.print("请选择：");

        //选择车型
        int typeChoose = sc.nextInt();
        if(typeChoose == 1) {
            carChoose.setType("轿车");

            System.out.println("品牌选择：1.宝马x6    2.宝马m6    3.别克君越    4.别克GL8    ");
            System.out.print("请选择：");

            //选择车品牌
            int brandChoose = sc.nextInt();
            if(brandChoose == 1) {
                carChoose.setBrand("宝马x6");
            } else if(brandChoose == 2) {
                carChoose.setBrand("宝马m6");
            } else if(brandChoose == 3) {
                carChoose.setBrand("别克君越");
            } else if(brandChoose == 4) {
                carChoose.setBrand("别克GL8");
            }

            //默认轿车座位数为4
            carChoose.setSeatNum(4);
        } else if(typeChoose == 2) {
            carChoose.setType("客车");

            System.out.println("品牌选择：1.金龙    2.金杯    ");
            System.out.print("请选择：");

            //选择车品牌
            int brandChoose = sc.nextInt();
            if(brandChoose == 1) {
                carChoose.setBrand("金龙");
            } else if(brandChoose == 2) {
                carChoose.setBrand("金杯");
            }

            System.out.println("请选择需要租的客车座位数：1.16座    2.34座    ");
            System.out.print("请选择：");

            //选择客车座位数
            int seatChoose = sc.nextInt();
            if(seatChoose == 1) {
                carChoose.setSeatNum(16);
            } else if(seatChoose == 2) {
                carChoose.setSeatNum(34);
            }
        }

        System.out.print("请输入要租借的天数：");

        //选择租借天数
        int days = sc.nextInt();

        //在车库中寻找满足条件的可租借车辆
        for(int i = 0;i < garage.getCczuCars().size();i++) {

            if(carChoose.getType().equals(garage.getCczuCars().get(i).getType()) && carChoose.getBrand().equals(garage.getCczuCars().get(i).getBrand())) {
                if(garage.getCczuCars().get(i) instanceof CCZUBus) {
                    if(carChoose.getSeatNum() != ((CCZUBus) garage.getCczuCars().get(i)).getSeatNum()) {
                        continue;
                    }
                }
                System.out.println("分配给你的车牌号是：" + garage.getCczuCars().get(i).getListen());
                System.out.println("您所需要支付的租金是：" + garage.getCczuCars().get(i).rent(days) + "元");
                System.out.print("是否确认订单？(Y/N)");
                String comfire = sc.next();
                if(comfire.equals("Y") || comfire.equals("y")) {
                    System.out.println("租车成功！！");
                } else {
                    System.out.println("租车失败！！");
                }
            }
        }
    }
}
