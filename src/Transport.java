public class Transport {
    String brand;
    String model;
    private final int year;
    private String color;
    private final String country;
    private int maximalSpeed;

    public Transport(String brand, String model, int year, String color, String country,int maximalSpeed) {
        if (brand==null || brand.isBlank()){this.brand="No brand";}
        else {this.brand = brand;}

        if (model==null || model.isBlank()){this.model="No model";}
        else {this.model = model;}

        this.year = Math.max(year, 0);

        setColor(color);

        if (country==null || country.isBlank()){this.country="Россия";}
        else {this.country = country;}

        setMaximalSpeed(maximalSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }

    public int getMaximalSpeed() {
        return maximalSpeed;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setMaximalSpeed(int maximalSpeed) {
        this.maximalSpeed = Math.max(maximalSpeed, 0);
    }

    @Override
    public String toString() {
        return "Транспортное средство " +
                getBrand() +
                " " + getModel() +
                ", годвыпуска " + getYear() +
                ", цвет " + getColor() +
                ", страна производства " + getCountry()
                +", максимальная скорость " + getMaximalSpeed();
    }
}
