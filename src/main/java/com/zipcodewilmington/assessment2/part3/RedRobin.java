package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird{

    String migrationMonth;

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public String color() {
        return "red";
    }

    public String getMigrationMonth() { return this.migrationMonth; }

    public void setMigrationMonth(String migrationMonth) { this.migrationMonth = migrationMonth; }
}
