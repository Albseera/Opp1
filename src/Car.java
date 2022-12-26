import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private String  country;
    private String color;
    private Integer year;
    private Double engineVolume;

    public Car(String brand, String model, String country, String color, Integer year, Double engineVolume) {

        if(brand==null) {
            this.brand="default";
        }else {
            this.brand=brand;
        }
        if(model==null) {
            this.model="default";
        }else {
            this.model=model;
        }
        if(country==null) {
            this.country="default";
        }else {
            this.country=country;
        }
        if(engineVolume<=0) {
            this.engineVolume=1.5;
        }else {
            this.engineVolume=engineVolume;
        }
        if(color==null) {
            this.color="белый";
        }else {
            this.color=color;
        }
        if(year<=0) {
            this.year = 2000;
        }else {
            this.year=year;
        }


    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "марка:" + brand + ", модель:" + model + ", страна сборки:" + country + ", цвет кузова:" + color + ", год производства:" +year + ", объем двигателя:" +engineVolume ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return brand.equals(car.brand) && model.equals(car.model) && year.equals(car.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year);
    }
}

