public class Main {


    public static void main(String[] args) {
        System.out.println("Задание 2");

        Car granta= new Car("Lada","Granta","сборка в России","желтого цвета",2015,1.7);
        Car audi= new Car("Audi","A8 50 L TDI quattro","сборка в Германии","сборка в Германии",2020,3.0);
        Car bmw= new Car("BMW","Z8","сборка в Германии","черный цвет",2021,3.0);
        Car kia= new Car("Kia","Sportage 4-го поколения","сборка в Южной Корее","красного цвета",2018,2.4);
        Car hundai= new Car("Hyundai","Avante","сборка в Южной Корее","оранжевого цвета",2016,1.6);

        System.out.println(granta.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hundai.toString());



    }
}