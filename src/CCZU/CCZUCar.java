package CCZU;

public class CCZUCar implements Car {

    private String type;        //车型
    private String brand;       //品牌
    private String listen;      //车牌
    private double dailyRent;   //日租

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

    @Override
    public double rent(int days) {
        if(days <= 7) {
            return dailyRent * days;
        } else if(days <= 30) {
            return dailyRent * days * 0.9;
        } else if(days <= 150) {
            return dailyRent * days * 0.8;
        } else {
            return dailyRent * days * 0.7;
        }
    }
}
