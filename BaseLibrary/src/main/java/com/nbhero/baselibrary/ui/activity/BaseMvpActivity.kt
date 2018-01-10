package com.nbhero.baselibrary.ui.activity

import com.nbhero.baselibrary.presenter.BasePresenter
import com.nbhero.baselibrary.presenter.view.BaseView

/**
 * Created by zlz on 2018/1/10.
 */
open class BaseMvpActivity <T:BasePresenter<*>>: BaseActivity(),BaseView {
    override fun hideLoading() {
    }

    override fun onError() {
    }

    override fun showLoading() {
    }

    lateinit var mPresenter:T
}