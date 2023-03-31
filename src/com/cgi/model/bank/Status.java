package com.cgi.model.bank;

public class Status {

    private boolean manager = false;
    private int year;

    public Status(boolean manager, int year) {
        this.manager = manager;
        this.year = year;
    }

    public Status(int year) {
        this.year = year;
    }

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Status{");
        sb.append("manager=").append(manager);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }
}
