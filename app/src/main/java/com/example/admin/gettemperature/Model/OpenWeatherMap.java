package com.example.admin.gettemperature.Model;

import java.util.List;

/**
 * Created by ADMIN on 5/18/2017.
 */

public class OpenWeatherMap {
    private Coord coord;
    private List<Weather> weather;
    private String base;
    private Main main;
    private int id;
    private Sys sys;
    private String name;
    private int cod;

    public OpenWeatherMap() {
    }

    public OpenWeatherMap(Coord coord, List<Weather> weather, String base, Main main, int id, Sys sys, String name, int cod) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.id = id;
        this.sys = sys;
        this.name = name;
        this.cod = cod;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
