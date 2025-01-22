/*
 * Copyright 2024 Android Byte Sensei
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/androidbytesensei/super-order-billing/blob/dev/LICENSE
 */
package cmp.navigation.di

import com.sensei.order.billing.core.common.di.DispatchersModule
import com.sensei.order.billing.core.data.di.DataModule
import org.koin.dsl.module

object KoinModules {
    private val dataModule = module {
        includes(DataModule)
    }

    private val dispatcherModule = module {
        includes(DispatchersModule)
    }

    val allModules = listOf(
        dataModule,
        dispatcherModule,
    )
}
