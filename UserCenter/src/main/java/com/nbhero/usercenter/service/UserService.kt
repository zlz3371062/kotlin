package com.nbhero.usercenter.service

import rx.Observable

/**
 * Created by zlz on 2018/1/10.
 */
interface UserService {

    fun register(mobile:String,pwd:String ,verifyCode:String)
            : Observable<Boolean>
}