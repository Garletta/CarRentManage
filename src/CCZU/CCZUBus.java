package CCZU;

public class CCZUBus extends CCZUCar {

    private int seatNum;        //座位数

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public int getSeatNum() {
        return seatNum;
    }

    @Override
    public double rent(int days) {
        double dailyRent = super.getDailyRent();
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
