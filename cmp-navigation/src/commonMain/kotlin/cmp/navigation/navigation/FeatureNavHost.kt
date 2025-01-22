/*
 * Copyright 2024 Android Byte Sensei
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/androidbytesensei/super-order-billing/blob/dev/LICENSE
 */
package cmp.navigation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.sensei.order.billing.feature.home.HOME_ROUTE
import com.sensei.order.billing.feature.home.homeScreen
import com.sensei.order.billing.feature.profile.profileScreen
import com.sensei.order.billing.feature.settings.notificationScreen
import com.sensei.order.billing.feature.settings.settingsScreen

@Composable
internal fun FeatureNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        route = NavGraphRoute.MAIN_GRAPH,
        startDestination = HOME_ROUTE,
        navController = navController,
        modifier = modifier,
    ) {
        homeScreen()

        profileScreen()

        settingsScreen(
            onBackClick = navController::popBackStack,
        )

        notificationScreen(
            onBackClick = navController::popBackStack,
        )
    }
}
