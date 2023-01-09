public class Main {
    public static void main(String[] args) {

        Cars cars_1=new Cars("Lada","Granta",2015,"желтый","Россия",0,
                1.7,"седан",5,"механическая","м129мм198",true);

        Cars cars_2=new Cars("Audi","A8 50 L TDI quattro",2020,"черный","Германия",0,3.0,
                "седан",5,"вариатор","м239мм198",false);

        Cars cars_3= new Cars("BMW","BMW",2021,"черный","Германия",0,3.0,
                "кабриолет",2,"автоматическая","м349мм198",true);

        Cars cars_4 = new Cars("KIA","Sportage",2018,"красный","Южная Корея",0,2.4,
                "кроссовер",5,"механическая","м459мм198",false);

        Cars cars_5 = new Cars("Hyundai","Avante",2016,"оранжевый","Южная Корея",0,1.6,
                "универсал",5,"автоматическая","м569мм198",true);

        System.out.println(cars_1);
        System.out.println(cars_2);
        System.out.println(cars_3);
        System.out.println(cars_4);
        System.out.println(cars_5);

        Cars test_driveCars = new Cars(null,"",-2016,"оранжевый","",-200,1.6,
                "",90,"автоматическая","v59мм18",true);

        System.out.println(test_driveCars);
        System.out.println(test_driveCars.checkRegNum());
        test_driveCars.setWheelsSeason(false);
        test_driveCars.setColor("зеленый");
        test_driveCars.setTypeTransmission("автоматическая");
        test_driveCars.setRegistrationNumber("т324тт178");
        test_driveCars.setEngineVolume(2.0);
        test_driveCars.setMaximalSpeed(280);
        System.out.println(test_driveCars);
        System.out.println(test_driveCars.checkRegNum());

        Transport cart= new Transport("","",1930,"коричневый","",15);
        System.out.println(cart);

        Bus bus_1=new Bus("Volvo","B12",1999,"","Sweden",180);
        System.out.println(bus_1);
        Bus bus_2=new Bus("Golden Dragon","XML6127",2022,"черный","China",200);
        System.out.println(bus_2);
        Bus bus_3=new Bus("MAN ","Lion's Coach",2011,"красный","Germany",210);
        System.out.println(bus_3);


    }
}

// „Вы знаете зачем вы создали лампу накаливания?
// — Нет, но я думаю правительство скоро поймет, как брать с людей за это деньги!“
// — Томас Эдисон