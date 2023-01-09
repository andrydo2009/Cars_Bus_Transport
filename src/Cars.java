public class Cars extends Transport{


    double engineVolume;
    private final   String typeBody;
    private String registrationNumber;
    private String typeTransmission;
    private final   int passengerSate;
    boolean wheelsSeason;
    public Cars (String brand, String model, int year, String color, String country,int maximalSpeed,double engineVolume,String typeBody,
                int passengerSate,String typeTransmission, String registrationNumber,boolean wheelsSeason)

    {  super(brand,
            model,
            year,
            color,
            country,
            maximalSpeed);


        if (engineVolume <= 0.0) { this.engineVolume=1.5;}
        else {this.engineVolume = engineVolume;}

        if (typeBody == null || typeBody.isBlank()) { this.typeBody="седан";}
        else {this.typeBody = typeBody;}

        if (passengerSate <= 0 || passengerSate > 7) { this.passengerSate=5;}
        else {this.passengerSate = passengerSate;}

        if (typeTransmission == null || typeTransmission.isBlank()) { this.typeTransmission="механическая";}
        else {this.typeTransmission = typeTransmission;}

        if (registrationNumber == null || registrationNumber.isBlank()) { this.registrationNumber="х000хх00";}
        else {this.registrationNumber = registrationNumber;}

        this.wheelsSeason=wheelsSeason;
    }



    public boolean isWheelsSeason() {
        return wheelsSeason;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getTypeTransmission() {
        return typeTransmission;
    }

    public int getPassengerSate() {
        return passengerSate;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank()) { this.registrationNumber="х000хх00";}
        else {this.registrationNumber = registrationNumber;}
    }

    public void setTypeTransmission(String typeTransmission) {
        if (typeTransmission == null || typeTransmission.isBlank()) { this.typeTransmission="механическая";}
        else {this.typeTransmission = typeTransmission;}
    }

    public void setWheelsSeason(boolean wheelsSeason) {
        this.wheelsSeason = wheelsSeason;
    }

    public boolean checkRegNum()
    {
        if (getRegistrationNumber().length() != 9)
        { return false; }
        char[] chars = getRegistrationNumber().toCharArray();
        if (!Character.isAlphabetic(chars[0])||!Character.isAlphabetic(chars[4])|| !Character.isAlphabetic(chars[5]))
        {
            return false;
        }
        return  Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) &&
                Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }
    public static String changeWheelSeason(boolean wheels){
        String season;
        if (wheels){season = " летние колеса " ;}
        else {season = " зимние колеса " ;}
        return season;
    }

    @Override
    public String toString() {
        return   super.toString() +
                ", обьем двигателя " + getEngineVolume() +
                ", тип кузова " + getTypeBody() +
                ", государственный номер " + getRegistrationNumber() +
                ", тип трансмиссии " + getTypeTransmission() +
                ", количество мест пссажиров " + getPassengerSate() +
                ", сезон резины " + changeWheelSeason(isWheelsSeason());
    }


}


// „Вы знаете зачем вы создали лампу накаливания?
// — Нет, но я думаю правительство скоро поймет, как брать с людей за это деньги!“
// — Томас Эдисон

