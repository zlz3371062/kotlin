package com.nbhero.baselibrary.data.net

import com.nbhero.baselibrary.common.BaseConstant
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by zlz on 2018/1/10.
 */
class RetrofitFactory private constructor(){

    companion object {

        val instance:RetrofitFactory by lazy{ RetrofitFactory()}

    }

    private val retrofit:Retrofit

    private val interceptor:Interceptor

    init {

        interceptor = Interceptor {

            it.proceed(it.request()
                    .newBuilder()
                    .addHeader("Content-Type", "application/json")
                    .addHeader("charset", "utf-8")
                    .build())

        }

        retrofit = Retrofit.Builder()
                .baseUrl(BaseConstant.SERVER_ADDRESS)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(initClient())
                .build()
    }

    private fun initClient(): OkHttpClient {

      return  OkHttpClient.Builder()
                .addInterceptor(initLogInterceptor())
                .connectTimeout(10,TimeUnit.SECONDS)
                .readTimeout(10,TimeUnit.SECONDS)
                .build()

    }

    private fun initLogInterceptor(): Interceptor {


            val interceptor  = HttpLoggingInterceptor()

            interceptor.level = HttpLoggingInterceptor.Level.BODY

            return interceptor
    }

    fun <T> create(service:Class<T>):T{

        return  retrofit.create(service)
    }


}