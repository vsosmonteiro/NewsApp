package com.loc.domain.usecases

import com.loc.domain.manager.LocalUserManager

class SaveAppEntry(private val localUserManager: LocalUserManager) {
        suspend operator fun invoke() {
            localUserManager.saveAppEntry()
        }
}