package programmer.zaman.now.application;

import static programmer.zaman.now.data.Application.PROCESSORS;
import static programmer.zaman.now.data.Constant.*;
import programmer.zaman.now.data.Country;
import programmer.zaman.now.util.MathUtil;

import java.sql.SQLOutput;

public class StaticApp {
    static void main(String[] args) {

        System.out.println(APPLICATOIN);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1,2,3,4,5));

        Country.City city = new Country.City();
        city.setName("Subang");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
