package com.silaypoyraz.wtcamp

import android.app.Application
import com.parse.Parse

class StarterApplication : Application() {

    override fun onCreate() {
        super.onCreate()

//hata mesajları göster
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG)

        Parse.initialize(Parse.Configuration.Builder(this)
            .applicationId("xAoyfm0utq1nLUrdimPwKFX48bERBKMxkL7vruzS")
            .server("https://parseapi.back4app.com/")
            .clientKey("iv4EZpVQ3cqbcR4nCSZeZFbMYzRkFKLCg1k0iGR9")
            .build()




)
    }


}