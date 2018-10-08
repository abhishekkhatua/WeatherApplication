package `in`.co.ngcapp.weatherapplication

import `in`.co.ngcapp.model.CurrentData
import `in`.co.ngcapp.viewmodel.WeatherData
import `in`.co.ngcapp.weatherapplication.services.ApiClientInstances
import `in`.co.ngcapp.weatherapplication.services.GetDataServices
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    var temperature: TextView? = null
    var country: TextView? = null
    var lottieAnimationView: LottieAnimationView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        temperature = findViewById(R.id.temperature)
        country = findViewById(R.id.country)
        lottieAnimationView = findViewById(R.id.animation_view)
        lottieAnimationView!!.loop(true)
        //lottieAnimationView!!.pauseAnimation()
        val apiClientInstance = ApiClientInstances.getRetrofitInstance()!!.create(GetDataServices::class.java)

        val getWeatherDetails: Call<CurrentData> = apiClientInstance.doGetListResources("hyderabad", "db9d302b2713d488e3c4a5caf9744bf1")
        getWeatherDetails.enqueue(object : Callback<CurrentData> {
            override fun onFailure(call: Call<CurrentData>, t: Throwable) {
                Log.i("Failure", t.message)
            }

            override fun onResponse(call: Call<CurrentData>, response: Response<CurrentData>) {
                val currentData: CurrentData = response.body()!!
                Log.i("WeatherData", currentData.city.population.toString())
                val weatherData = WeatherData(currentData)
                Log.i("WeatherData", weatherData.cityName)
                temperature!!.text = weatherData.getTemp()
                country!!.text = weatherData.cityName
                Log.i("MainActivity.this", "$country $temperature")
            }
        })
    }
}

