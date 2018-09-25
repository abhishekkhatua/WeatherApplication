package `in`.co.ngcapp.weatherapplication.services

import `in`.co.ngcapp.model.CurrentData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetDataServices {

    @GET("forecast?")
    fun doGetListResources(@Query("q") name:String  ,@Query("APPID") appId:String): Call<CurrentData>
}