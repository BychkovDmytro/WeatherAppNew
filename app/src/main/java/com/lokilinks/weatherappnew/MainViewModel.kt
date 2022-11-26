package com.lokilinks.weatherappnew

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lokilinks.weatherappnew.adapters.WeatherModel

class MainViewModel : ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}