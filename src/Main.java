public class Main {


    public static void main(String[] args) {
        System.out.println("Задание 1");

        Car granta= new Car();
        granta.brand="Lada";
        granta.model="Granta";
        granta.country="сборка в России";
        granta.color="желтого цвета";
        granta.year=2015;
        granta.engineVolume=1.7;


        Car audi= new Car();
        audi.brand="Audi";
        audi.model="A8 50 L TDI quattro";
        audi.country="сборка в Германии";
        audi.color="черного цвета";
        audi.year=2020;
        audi.engineVolume=3.0;

        Car bmw= new Car();
        bmw.brand="BMW";
        bmw.model="Z8";
        bmw.country="сборка в Германии";
        bmw.color="черного цвета";
        bmw.year=2021;
        bmw.engineVolume=3.0;

        Car kia= new Car();
        kia.brand="Kia";
        kia.model="Sportage 4-го поколения";
        kia.country="сборка в Южной Корее";
        kia.color="красного цвета";
        kia.year=2018;
        kia.engineVolume=2.4;

        Car hundai= new Car();
        hundai.brand="Hyundai";
        hundai.model="Avante";
        hundai.country="сборка в Южной Корее";
        hundai.color="оранжевого цвета";
        hundai.year=2016;
        hundai.engineVolume=1.6;


        System.out.println(granta.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hundai.toString());



    }
}