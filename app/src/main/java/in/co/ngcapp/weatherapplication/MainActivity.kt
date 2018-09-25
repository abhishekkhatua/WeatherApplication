package `in`.co.ngcapp.weatherapplication

import `in`.co.ngcapp.model.CurrentData
import `in`.co.ngcapp.weatherapplication.services.ApiClientInstances
import `in`.co.ngcapp.weatherapplication.services.GetDataServices
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var apiClientInstance = ApiClientInstances.getRetrofitInstance()!!.create(GetDataServices::class.java)

        var getWeatherDetails: Call<CurrentData> = apiClientInstance.doGetListResources("hyderabad", "db9d302b2713d488e3c4a5caf9744bf1")
        getWeatherDetails.enqueue(object : Callback<CurrentData> {
            override fun onFailure(call: Call<CurrentData>, t: Throwable) {
                Log.i("Failure", t.message)
            }

            override fun onResponse(call: Call<CurrentData>, response: Response<CurrentData>) {


                var currentData :CurrentData = response.body()!!

                Log.i("GetCurrentData", currentData.city.population.toString())

            }

        })

    }
}

