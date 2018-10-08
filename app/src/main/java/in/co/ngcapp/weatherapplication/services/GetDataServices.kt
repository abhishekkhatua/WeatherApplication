package `in`.co.ngcapp.weatherapplication.services

import `in`.co.ngcapp.model.CurrentData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetDataServices {

    @GET("forecast?")
    fun doGetListResources(@Query("q") name:String  ,@Query("APPID") appId:String): Call<CurrentData>

     //api.openweathermap.org/data/2.5/weather?id=1269843&APPID=db9d302b2713d488e3c4a5caf9744bf1&units=metric

    @GET("weather?")
    fun getCurrentWeather(@Query("id")locationId:String,@Query("APPID")appId: String,@Query("units")unitsCelcius:String)




}