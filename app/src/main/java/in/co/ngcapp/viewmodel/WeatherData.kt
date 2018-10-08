package `in`.co.ngcapp.viewmodel

import `in`.co.ngcapp.model.CurrentData
import android.databinding.BaseObservable

class WeatherData :BaseObservable {
     var cityName:String ?= null
     var temperature:String?= null
    constructor( currentData: CurrentData){
         this.cityName = currentData.city.name
         this.temperature = currentData.message.toString()
     }
     fun getMyName(): String {
         //get city name
         return this.cityName!!
     }
     fun setMyName(value:String){
         //set city name
         this.cityName = value
     }
     fun getTemp():String {
         //get city temperature
         return  this.temperature!!
     }
     fun setTemp(mValue :String){
         //set city temperature
         this.temperature = mValue
     }
}