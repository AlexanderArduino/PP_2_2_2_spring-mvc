package web.models;

public class Car {

    private String carModel;

    private String carType;

    private String gosNomer;

    public Car(String carModel, String carType, String gosNomer) {
        this.carModel = carModel;
        this.carType = carType;
        this.gosNomer = gosNomer;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getGosNomer() {
        return gosNomer;
    }

    public void setGosNomer(String gosNomer) {
        this.gosNomer = gosNomer;
    }
}
