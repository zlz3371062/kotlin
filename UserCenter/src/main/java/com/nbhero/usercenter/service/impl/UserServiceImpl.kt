package com.nbhero.usercenter.service.impl

import com.nbhero.baselibrary.data.protocol.BaseResp
import com.nbhero.baselibrary.rx.BaseException
import com.nbhero.usercenter.data.repository.UserRepository
import com.nbhero.usercenter.service.UserService
import rx.Observable
import rx.functions.Func1
import javax.inject.Inject

/**
 * Created by zlz on 2018/1/10.
 */
class UserServiceImpl @Inject constructor():UserService {

    @Inject
    lateinit var repository:UserRepository

    override fun register(mobile: String, pwd: String, verifyCode: String): Observable<Boolean> {

        var z = 1111

        return  repository.register(mobile,pwd,verifyCode)
                .flatMap(object :Func1<BaseResp<String>,Observable<Boolean>>{
                    override fun call(t: BaseResp<String>): Observable<Boolean> {

                        if (t.status != 0){
                        return Observable.error(BaseException(t.status,t.message))

                        }
                           return Observable.just(true)
                    }
                })
    }
}