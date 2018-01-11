package com.nbhero.usercenter.injection.module

import com.nbhero.usercenter.service.UserService
import com.nbhero.usercenter.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides

/**
 * Created by zlz on 2018/1/11.
 */

@Module
class UserModule{

    @Provides
    fun providesUserService(service:UserServiceImpl):UserService{


        return  service

    }




}