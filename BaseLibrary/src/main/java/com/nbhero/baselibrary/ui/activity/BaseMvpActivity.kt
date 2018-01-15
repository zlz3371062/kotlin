package com.nbhero.baselibrary.ui.activity

import com.nbhero.baselibrary.presenter.BasePresenter
import com.nbhero.baselibrary.presenter.view.BaseView
import javax.inject.Inject

/**
 * Created by zlz on 2018/1/10.
 */
open class BaseMvpActivity <T:BasePresenter<*>>: BaseActivity(),BaseView {


    var data = listOf(1,2,3)

    override fun hideLoading() {
    }

    override fun onError() {
    }

    override fun showLoading() {
    }

    @Inject
    lateinit var mPresenter:T
}