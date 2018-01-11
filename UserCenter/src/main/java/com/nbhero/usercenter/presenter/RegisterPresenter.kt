package com.nbhero.usercenter.presenter

import com.nbhero.baselibrary.ext.execute
import com.nbhero.baselibrary.presenter.BasePresenter
import com.nbhero.baselibrary.rx.BaseSubscriber
import com.nbhero.usercenter.presenter.view.RegisterView
import com.nbhero.usercenter.service.UserService
import javax.inject.Inject

/**
 * Created by zlz on 2018/1/10.
 */
class RegisterPresenter @Inject constructor(): BasePresenter<RegisterView>() {

    @Inject
    lateinit var userService : UserService

    fun register(mobile:String ,pwd:String,verifyCode:String){

        userService.register(mobile,verifyCode,pwd)
                .execute(object : BaseSubscriber<Boolean>(){
                    override fun onNext(t: Boolean) {
                        mView.onRrgisterResule(t)
                    }

                })

    }


}