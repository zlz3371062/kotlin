package com.nbhero.baselibrary.presenter

import com.nbhero.baselibrary.presenter.view.BaseView

/**
 * Created by zlz on 2018/1/10.
 */
open class BasePresenter<T:BaseView> {


    lateinit var mView :T



}