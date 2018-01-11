package com.nbhero.usercenter.data.api

import com.nbhero.baselibrary.data.protocol.BaseResp
import com.nbhero.usercenter.data.protocol.RegisterReq
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

/**
 * Created by zlz on 2018/1/11.
 */
interface UserApi {

    @POST("userCenter/register")
    fun registr(@Body req : RegisterReq):Observable<BaseResp<String>>

}