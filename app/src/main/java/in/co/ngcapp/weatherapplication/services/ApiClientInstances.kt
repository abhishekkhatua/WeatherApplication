package `in`.co.ngcapp.weatherapplication.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClientInstances() {
    companion object {

        private var BASE_URL = "https://api.openweathermap.org/data/2.5/"
        private var retrofit: Retrofit? = null

        fun getRetrofitInstance(): Retrofit? {

            if (retrofit == null) {
                retrofit = retrofit2.Retrofit.Builder().baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()

            }
            return retrofit
        }

    }
}