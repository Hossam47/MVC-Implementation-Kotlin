/*
 * *
 *  * Created by Hossam Waziry on 28/02/2022, 18:57
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 28/02/2022, 18:57
 *
 */

package com.hossam.mvcimplementation.database

import com.hossam.mvcimplementation.data.User

object Database {

    fun getCurrentUser():User{
        return User("Hossam","12345")
    }
}