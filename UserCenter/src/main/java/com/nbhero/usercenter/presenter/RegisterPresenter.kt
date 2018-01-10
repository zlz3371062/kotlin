package com.nbhero.usercenter.presenter

import com.nbhero.baselibrary.ext.execute
import com.nbhero.baselibrary.presenter.BasePresenter
import com.nbhero.baselibrary.rx.BaseSubscriber
import com.nbhero.usercenter.presenter.view.RegisterView
import com.nbhero.usercenter.service.impl.UserServiceImpl
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Created by zlz on 2018/1/10.
 */
class RegisterPresenter: BasePresenter<RegisterView>() {

    fun register(mobile:String ,verifyCode:String,pwd:String){


        var userService = UserServiceImpl()
        userService.register(mobile,verifyCode,pwd)
                .execute(object : BaseSubscriber<Boolean>(){
                    override fun onNext(t: Boolean) {
                        mView.onRrgisterResule(t)
                    }

                })

    }


}