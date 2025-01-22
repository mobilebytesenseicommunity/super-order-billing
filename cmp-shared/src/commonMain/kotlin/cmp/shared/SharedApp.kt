/*
 * Copyright 2024 Android Byte Sensei
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/androidbytesensei/super-order-billing/blob/dev/LICENSE
 */
package cmp.shared

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cmp.navigation.ComposeApp

@Composable
fun SharedApp(
    modifier: Modifier = Modifier,
) {
    ComposeApp(modifier = modifier)
}
