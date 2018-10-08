package in.co.ngcapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {


    @Expose
    @SerializedName("cod")
    public int cod;
    @Expose
    @SerializedName("name")
    public String name;
    @Expose
    @SerializedName("id")
    public int id;
    @Expose
    @SerializedName("sys")
    public Sys sys;
    @Expose
    @SerializedName("dt")
    public int dt;
    @Expose
    @SerializedName("clouds")
    public Clouds clouds;
    @Expose
    @SerializedName("wind")
    public Wind wind;
    @Expose
    @SerializedName("visibility")
    public int visibility;
    @Expose
    @SerializedName("main")
    public Main main;
    @Expose
    @SerializedName("base")
    public String base;
    @Expose
    @SerializedName("weather")
    public List<Weather> weather;
    @Expose
    @SerializedName("coord")
    public Coord coord;

    public static class Sys {
        @Expose
        @SerializedName("sunset")
        public int sunset;
        @Expose
        @SerializedName("sunrise")
        public int sunrise;
        @Expose
        @SerializedName("country")
        public String country;
        @Expose
        @SerializedName("message")
        public double message;
        @Expose
        @SerializedName("id")
        public int id;
        @Expose
        @SerializedName("type")
        public int type;
    }

    public static class Clouds {
        @Expose
        @SerializedName("all")
        public int all;
    }

    public static class Wind {
        @Expose
        @SerializedName("deg")
        public int deg;
        @Expose
        @SerializedName("speed")
        public double speed;
    }

    public static class Main {
        @Expose
        @SerializedName("temp_max")
        public int temp_max;
        @Expose
        @SerializedName("temp_min")
        public int temp_min;
        @Expose
        @SerializedName("humidity")
        public int humidity;
        @Expose
        @SerializedName("pressure")
        public int pressure;
        @Expose
        @SerializedName("temp")
        public int temp;
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

    public static class Coord {
        @Expose
        @SerializedName("lat")
        public double lat;
        @Expose
        @SerializedName("lon")
        public double lon;
    }
}
