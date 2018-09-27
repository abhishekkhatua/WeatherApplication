package in.co.ngcapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CurrentData {


    @Expose
    @SerializedName("city")
    public City city;
    @Expose
    @SerializedName("list")
    private java.util.List<List> list;
    @Expose
    @SerializedName("cnt")
    private int cnt;
    @Expose
    @SerializedName("message")
    public double message;
    @Expose
    @SerializedName("cod")
    public String cod;

    public static class City {
        @Expose
        @SerializedName("population")
        public int population;
        @Expose
        @SerializedName("country")
        public String country;
        @Expose
        @SerializedName("coord")
        private Coord coord;
        @Expose
        @SerializedName("name")
        private String name;
        @Expose
        @SerializedName("id")
        private int id;
    }

    public static class Coord {
        @Expose
        @SerializedName("lon")
        private double lon;
        @Expose
        @SerializedName("lat")
        private double lat;
    }

    public static class List {
        @Expose
        @SerializedName("dt_txt")
        private String dt_txt;
        @Expose
        @SerializedName("sys")
        private Sys sys;
        @Expose
        @SerializedName("rain")
        private Rain rain;
        @Expose
        @SerializedName("wind")
        private Wind wind;
        @Expose
        @SerializedName("clouds")
        private Clouds clouds;
        @Expose
        @SerializedName("weather")
        private java.util.List<Weather> weather;
        @Expose
        @SerializedName("main")
        private Main main;
        @Expose
        @SerializedName("dt")
        private int dt;
    }

    public static class Sys {
        @Expose
        @SerializedName("pod")
        private String pod;
    }

    public static class Rain {
        @Expose
        @SerializedName("3h")
        private double rain;
    }

    public static class Wind {
        @Expose
        @SerializedName("deg")
        private double deg;
        @Expose
        @SerializedName("speed")
        private double speed;
    }

    public static class Clouds {
        @Expose
        @SerializedName("all")
        private int all;
    }

    public static class Weather {
        @Expose
        @SerializedName("icon")
        private String icon;
        @Expose
        @SerializedName("description")
        private String description;
        @Expose
        @SerializedName("main")
        private String main;
        @Expose
        @SerializedName("id")
        private int id;
    }

    public static class Main {
        @Expose
        @SerializedName("temp_kf")
        private double temp_kf;
        @Expose
        @SerializedName("humidity")
        private int humidity;
        @Expose
        @SerializedName("grnd_level")
        private double grnd_level;
        @Expose
        @SerializedName("sea_level")
        private double sea_level;
        @Expose
        @SerializedName("pressure")
        private double pressure;
        @Expose
        @SerializedName("temp_max")
        private double temp_max;
        @Expose
        @SerializedName("temp_min")
        private double temp_min;
        @Expose
        @SerializedName("temp")
        private double temp;
    }
}
