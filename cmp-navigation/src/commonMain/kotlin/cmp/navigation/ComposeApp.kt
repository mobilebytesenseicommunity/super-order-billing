/*
 * Copyright 2025 Android Byte Sensei
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/androidbytesensei/super-order-billing/blob/dev/LICENSE
 */
package cmp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import cmp.navigation.navigation.RootNavGraph
import com.sensei.order.billing.core.data.utils.NetworkMonitor
import com.sensei.order.billing.core.data.utils.TimeZoneMonitor
import com.sensei.order.billing.core.designsystem.theme.SuperOrderBillingTheme
import org.koin.compose.koinInject

@Composable
fun ComposeApp(
    modifier: Modifier = Modifier,
    networkMonitor: NetworkMonitor = koinInject(),
    timeZoneMonitor: TimeZoneMonitor = koinInject(),
) {
    SuperOrderBillingTheme {
        RootNavGraph(
            networkMonitor = networkMonitor,
            timeZoneMonitor = timeZoneMonitor,
            navHostController = rememberNavController(),
            modifier = modifier,
        )
    }
}
