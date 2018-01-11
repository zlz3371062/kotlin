package com.nbhero.usercenter.ui.activity

import android.os.Bundle
import com.nbhero.baselibrary.ui.activity.BaseMvpActivity
import com.nbhero.usercenter.R
import com.nbhero.usercenter.presenter.RegisterPresenter
import com.nbhero.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.ac_register.*
import org.jetbrains.anko.toast

open class RegisterActivity : BaseMvpActivity<RegisterPresenter>() ,RegisterView{
    override fun onRrgisterResule(result: Boolean) {
        toast("注册成功")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_register)
        mPresenter = RegisterPresenter()
        mPresenter.mView = this
        mRegisterBtn.setOnClickListener{mPresenter.register(mPhone.text.toString(),mPassword.text.toString(),mVerigyCode.text.toString())}
    }
}
