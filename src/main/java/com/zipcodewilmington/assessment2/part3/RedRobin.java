package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird{

    String migrationMonth;

    @Override
    public int getSpeed() { return 8; }

    @Override
    public String color() { return "red"; }

    @Override
    public void setMigrationMonth(String migrationMonth) { this.migrationMonth = migrationMonth; }

    @Override
    public String getMigrationMonth() { return migrationMonth; }


}
