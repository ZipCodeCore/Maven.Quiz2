package com.zipcodewilmington.assessment2.part3;

public class Bird {
    String migrationMonth = "";
    public String move() {
        return "fly";
    }

    public void setMigrationMonth(String expected) {
        this.migrationMonth = expected;

    }

    public String getMigrationMonth() {
        return migrationMonth;
    }
}
