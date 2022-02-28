/*
 * *
 *  * Created by Hossam Waziry on 28/02/2022, 18:57
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 28/02/2022, 18:57
 *
 */

package com.hossam.mvcimplementation.ui

import com.hossam.mvcimplementation.database.Database

class MainController {

    fun login(username: String, password: String): Int {
        return if (
            username == Database.getCurrentUser().username &&
            password == Database.getCurrentUser().password
        ) 1
        else 0
    }
}