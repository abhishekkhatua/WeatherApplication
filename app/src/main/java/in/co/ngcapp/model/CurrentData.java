package in.co.ngcapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CurrentData {


    @Expose
    @SerializedName("city")
    public City city;
    @Expose
    @SerializedName("list")
    public java.util.List<List> list;
    @Expose
    @SerializedName("cnt")
    public int cnt;
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
        public Coord coord;
        @Expose
        @SerializedName("name")
        public String name;
        @Expose
        @SerializedName("id")
        public int id;
    }

    public static class Coord {
        @Expose
        @SerializedName("lon")
        public double lon;
        @Expose
        @SerializedName("lat")
        public double lat;
    }

    public static class List {
        @Expose
        @SerializedName("dt_txt")
        public String dt_txt;
        @Expose
        @SerializedName("sys")
        public Sys sys;
        @Expose
        @SerializedName("rain")
        public Rain rain;
        @Expose
        @SerializedName("wind")
        public Wind wind;
        @Expose
        @SerializedName("clouds")
        public Clouds clouds;
        @Expose
        @SerializedName("weather")
        public java.util.List<Weather> weather;
        @Expose
        @SerializedName("main")
        public Main main;
        @Expose
        @SerializedName("dt")
        public int dt;
    }

    public static class Sys {
        @Expose
        @SerializedName("pod")
        public String pod;
    }

    public static class Rain {
        @Expose
        @SerializedName("3h")
        public double rain;
    }

    public static class Wind {
        @Expose
        @SerializedName("deg")
        public double deg;
        @Expose
        @SerializedName("speed")
        public double speed;
    }

    public static class Clouds {
        @Expose
        @SerializedName("all")
        public int all;
    }

    public static class Weather {
        @Expose
        @SerializedName("icon")
        public String icon;
        @Expose
        @SerializedName("description")
        public String description;
        @Expose
        @SerializedName("main")
        public String main;
        @Expose
        @SerializedName("id")
        public int id;
    }

    public static class Main {
        @Expose
        @SerializedName("temp_kf")
        public double temp_kf;
        @Expose
        @SerializedName("humidity")
        public int humidity;
        @Expose
        @SerializedName("grnd_level")
        public double grnd_level;
        @Expose
        @SerializedName("sea_level")
        public double sea_level;
        @Expose
        @SerializedName("pressure")
        public double pressure;
        @Expose
        @SerializedName("temp_max")
        public double temp_max;
        @Expose
        @SerializedName("temp_min")
        public double temp_min;
        @Expose
        @SerializedName("temp")
        public double temp;
    }
}
