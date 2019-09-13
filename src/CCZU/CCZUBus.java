package CCZU;

public class CCZUBus implements Car {

    private String type;        //车型
    private String brand;       //品牌
    private String listen;      //车牌
    private double dailyRent;   //日租
    private int seatNum;        //座位数

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getListen() {
        return listen;
    }

    public void setListen(String listen) {
        this.listen = listen;
    }

    public double getDailyRent() {
        return dailyRent;
    }

    public void setDailyRent(double dailyRent) {
        this.dailyRent = dailyRent;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    @Override
    public double rent(int days) {
        if(days <= 3) {
            return dailyRent * days;
        } else if(days <= 7) {
            return dailyRent * days * 0.9;
        } else if(days <= 30) {
            return dailyRent * days * 0.8;
        } else if(days <= 150) {
            return dailyRent * days * 0.7;
        } else {
            return dailyRent * days * 0.6;
        }
    }
}
