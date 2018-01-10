package com.nbhero.baselibrary.ext

import com.nbhero.baselibrary.rx.BaseSubscriber
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Created by zlz on 2018/1/10.
 */
fun <T> Observable<T>.execute(subscriber: BaseSubscriber<T>){

     this.observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(subscriber)
}