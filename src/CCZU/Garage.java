package CCZU;

import java.util.ArrayList;

public class Garage {

    public ArrayList<CCZUBus> cczuBuss;

    //初始化车库信息
    public void init() {
        cczuBuss = new ArrayList<>();

        CCZUBus cczuBus = new CCZUBus();
        cczuBus.setType("轿车");
        cczuBus.setBrand("宝马x6");
        cczuBus.setListen("苏DY2854");
        cczuBus.setDailyRent(800.0);
        cczuBuss.add(cczuBus);

        cczuBus = new CCZUBus();
        cczuBus.setType("轿车");
        cczuBus.setBrand("宝马m6");
        cczuBus.setSeatNum(4);
        cczuBus.setListen("苏DA3288");
        cczuBus.setDailyRent(600.0);
        cczuBuss.add(cczuBus);

        cczuBus = new CCZUBus();
        cczuBus.setType("轿车");
        cczuBus.setBrand("别克君越");
        cczuBus.setSeatNum(4);
        cczuBus.setListen("苏DT3762");
        cczuBus.setDailyRent(300.0);
        cczuBuss.add(cczuBus);

        cczuBus = new CCZUBus();
        cczuBus.setType("轿车");
        cczuBus.setBrand("别克GL8");
        cczuBus.setSeatNum(4);
        cczuBus.setListen("苏D96996");
        cczuBus.setDailyRent(500.0);
        cczuBuss.add(cczuBus);

        cczuBus = new CCZUBus();
        cczuBus.setType("客车");
        cczuBus.setBrand("金龙");
        cczuBus.setSeatNum(34);
        cczuBus.setListen("苏D89885");
        cczuBus.setDailyRent(1500.0);
        cczuBuss.add(cczuBus);

        cczuBus = new CCZUBus();
        cczuBus.setType("客车");
        cczuBus.setBrand("金杯");
        cczuBus.setSeatNum(34);
        cczuBus.setListen("苏DN6344");
        cczuBus.setDailyRent(1500.0);
        cczuBuss.add(cczuBus);

        cczuBus = new CCZUBus();
        cczuBus.setType("客车");
        cczuBus.setBrand("金龙");
        cczuBus.setSeatNum(16);
        cczuBus.setListen("苏D5732");
        cczuBus.setDailyRent(800.0);
        cczuBuss.add(cczuBus);

        cczuBus = new CCZUBus();
        cczuBus.setType("客车");
        cczuBus.setBrand("金杯");
        cczuBus.setSeatNum(16);
        cczuBus.setListen("苏D36271");
        cczuBus.setDailyRent(800.0);
        cczuBuss.add(cczuBus);

        System.out.println("********** 车库信息 **********");
        for (int i = 0; i < cczuBuss.size(); i++) {
            System.out.println(cczuBuss.get(i).getType() + "," + cczuBuss.get(i).getBrand() + "," + cczuBuss.get(i).getSeatNum() + "," + cczuBuss.get(i).getListen() + "," + cczuBuss.get(i).getDailyRent());
        }
    }
}
