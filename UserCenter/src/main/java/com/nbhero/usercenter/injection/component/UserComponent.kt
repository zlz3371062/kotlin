package com.nbhero.usercenter.injection.component

import com.nbhero.usercenter.injection.module.UserModule
import com.nbhero.usercenter.ui.activity.RegisterActivity
import dagger.Component

/**
 * Created by zlz on 2018/1/11.
 */

@Component(modules = arrayOf(UserModule::class))
interface UserComponent {

    fun injuct(activity:RegisterActivity)

}