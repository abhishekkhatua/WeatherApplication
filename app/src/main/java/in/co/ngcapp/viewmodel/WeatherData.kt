package `in`.co.ngcapp.viewmodel

import `in`.co.ngcapp.model.CurrentData
import android.databinding.BaseObservable

class WeatherData :BaseObservable {
     var cityName:String ?= null
     var temperature :String?= null




    constructor( currentData: CurrentData){
         this.cityName = currentData.city.country
         this.temperature = currentData.message.toString()

     }

     fun getMyName(): String {
         //include validation, logic, logging or whatever you like here
         return this.cityName!!
     }
     fun setMyName(value:String){
         this.cityName = value
     }

     fun getTemp():String {
         return  this.temperature!!
     }
     fun setTemp(mValue :String){
         this.temperature = mValue
     }

}