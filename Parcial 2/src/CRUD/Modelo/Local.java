package CRUD.Modelo;

import java.io.Serializable;

public class Local implements Serializable {
    public int LocalNum;
    private String name;
    private String category;
    private String schedule;

    public Local(int localNum, String name, String category, String phone) {
        LocalNum = localNum;
        this.name = name;
        this.category = category;
        this.schedule = phone;
    }

    public int getLocalNum() {
        return LocalNum;
    }

    public void setLocalNum(int localNum) {
        LocalNum = localNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Local -> " +
                "Local Number = " + LocalNum +
                ", Name = " + name + '\'' +
                ", Category = " + category + '\'' +
                ", Schedule = " + schedule + '\'';
    }
}
