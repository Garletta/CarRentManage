package CCZU;

import java.util.ArrayList;

public class Garage {

    private ArrayList<CCZUCar> cczuCars;

    public ArrayList<CCZUCar> getCczuCars() {
        return cczuCars;
    }

    public void setCczuCars(ArrayList<CCZUCar> cczuCars) {
        this.cczuCars = cczuCars;
    }

    //初始化车库信息
    public void init() {
        cczuCars = new ArrayList<>();

        CCZUCar cczuCar = new CCZUCar();
        cczuCar.setType("轿车");
        cczuCar.setBrand("宝马x6");
        cczuCar.setListen("苏DY2854");
        cczuCar.setDailyRent(800);
        cczuCars.add(cczuCar);

        cczuCar = new CCZUCar();
        cczuCar.setType("轿车");
        cczuCar.setBrand("宝马m6");
        cczuCar.setListen("苏DA3288");
        cczuCar.setDailyRent(600);
        cczuCars.add(cczuCar);

        cczuCar = new CCZUCar();
        cczuCar.setType("轿车");
        cczuCar.setBrand("别克君越");
        cczuCar.setListen("苏DT3762");
        cczuCar.setDailyRent(300);
        cczuCars.add(cczuCar);

        cczuCar = new CCZUCar();
        cczuCar.setType("轿车");
        cczuCar.setBrand("别克GL8");
        cczuCar.setListen("苏D96996");
        cczuCar.setDailyRent(500);
        cczuCars.add(cczuCar);

        CCZUBus cczuBus = new CCZUBus();
        cczuBus.setType("客车");
        cczuBus.setBrand("金龙");
        cczuBus.setSeatNum(34);
        cczuBus.setListen("苏D89885");
        cczuBus.setDailyRent(1500);
        cczuCars.add(cczuBus);

        cczuBus = new CCZUBus();
        cczuBus.setType("客车");
        cczuBus.setBrand("金杯");
        cczuBus.setSeatNum(34);
        cczuBus.setListen("苏DN6344");
        cczuBus.setDailyRent(1500);
        cczuCars.add(cczuBus);

        cczuBus = new CCZUBus();
        cczuBus.setType("客车");
        cczuBus.setBrand("金龙");
        cczuBus.setSeatNum(16);
        cczuBus.setListen("苏D5732");
        cczuBus.setDailyRent(800);
        cczuCars.add(cczuBus);

        cczuBus = new CCZUBus();
        cczuBus.setType("客车");
        cczuBus.setBrand("金杯");
        cczuBus.setSeatNum(16);
        cczuBus.setListen("苏D36271");
        cczuBus.setDailyRent(800);
        cczuCars.add(cczuBus);

        System.out.println("********** 车库信息 **********");
        for(CCZUCar car : cczuCars) {
            System.out.print(car.getType() + "," + car.getBrand() + ",");
            if(car instanceof CCZUBus) {
                System.out.print(((CCZUBus) car).getSeatNum() + ",");
            }
            System.out.println(car.getListen() + "," + car.getDailyRent());
        }
    }
}
