package com.nbhero.usercenter.service.impl

import com.nbhero.usercenter.service.UserService
import rx.Observable

/**
 * Created by zlz on 2018/1/10.
 */
class UserServiceImpl:UserService {

    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {

        return Observable.just(true)

    }
}