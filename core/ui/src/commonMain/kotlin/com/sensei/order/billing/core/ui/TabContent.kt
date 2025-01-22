/*
 * Copyright 2024 Android Byte Sensei
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/androidbytesensei/super-order-billing/blob/dev/LICENSE
 */
package com.sensei.order.billing.core.ui

import androidx.compose.runtime.Composable

data class TabContent(
    val tabName: String,
    val content: @Composable () -> Unit,
)
