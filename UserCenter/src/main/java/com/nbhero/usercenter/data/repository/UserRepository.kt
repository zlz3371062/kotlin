package com.nbhero.usercenter.data.repository

import com.nbhero.baselibrary.data.net.RetrofitFactory
import com.nbhero.baselibrary.data.protocol.BaseResp
import com.nbhero.usercenter.data.api.UserApi
import com.nbhero.usercenter.data.protocol.RegisterReq
import rx.Observable
import javax.inject.Inject

/**
 * Created by zlz on 2018/1/11.
 */
class  UserRepository @Inject constructor(){


    fun register(mobile:String,pwd:String,verifyCode:String )
            : Observable<BaseResp<String>>{


       return RetrofitFactory.instance.create(UserApi::class.java)
                .registr(RegisterReq(mobile,pwd,verifyCode))

    }



}