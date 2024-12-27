package pojo;

import java.util.List;

public class Employee {
    private String employeeName;
    private String location;
    private long sapCode;
    private List<String> skill;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getSapCode() {
        return sapCode;
    }

    public void setSapCode(long sapCode) {
        this.sapCode = sapCode;
    }

    public List<String> getSkill() {
        return skill;
    }

    public void setSkill(List<String> skill) {
        this.skill = skill;
    }
}

