package web.model;

public class Car {

    private int id;
    private String model;
    private String year;

    public Car(int id, String model, String year) {
        this.id = id;
        this.model = model;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String series) {
        this.year = series;
    }
}
