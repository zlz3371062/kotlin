package com.nbhero.baselibrary.rx

import rx.Subscriber

/**
 * Created by zlz on 2018/1/10.
 */
open class BaseSubscriber<T> :Subscriber<T>() {

    override fun onNext(t: T) {
    }

    override fun onError(e: Throwable?) {
    }

    override fun onCompleted() {
    }
}