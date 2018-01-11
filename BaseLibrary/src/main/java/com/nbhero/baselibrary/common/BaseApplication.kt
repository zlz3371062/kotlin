package com.nbhero.baselibrary.common

import android.app.Application

/**
 * Created by zlz on 2018/1/11.
 */
class BaseApplication :Application(){

    override fun onCreate() {
        super.onCreate()

        initAppInjection()
    }

    private fun initAppInjection() {



    }
}