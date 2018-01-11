package com.nbhero.baselibrary.data.protocol

/**
 * Created by zlz on 2018/1/11.
 */
class BaseResp<out T> (val status : Int, val message:String, val data:T)