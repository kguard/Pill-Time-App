package com.blueguard.pilltime.navigation

import com.blueguard.pilltime.core.designsystem.icon.PillTimeIcon

/**
 * 2023-12-20
 * pureum
 */
enum class Destination(
    val selectedIcon: Int,
    val unSelectedIcon: Int,
    val iconTextId: String,
    val titleTextId: String,
) {
    ALARM(
        selectedIcon = PillTimeIcon.HomeBorder,
        unSelectedIcon = PillTimeIcon.Home,
        iconTextId = "Alarm",
        titleTextId = "Alarm"
    ),
    RECORD(
        selectedIcon = PillTimeIcon.RecordBorder,
        unSelectedIcon = PillTimeIcon.Record,
        iconTextId = "Record",
        titleTextId = "Record"
    ),
    SETTING(
        selectedIcon = PillTimeIcon.SettingBorder,
        unSelectedIcon = PillTimeIcon.Setting,
        iconTextId = "Setting",
        titleTextId = "Setting"
    )
}