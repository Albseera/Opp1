import java.util.Objects;

public class Car {
    public String brand;
    public String model;
    public String  country;
    public String color;
    public Integer year;
    public Double engineVolume;



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

