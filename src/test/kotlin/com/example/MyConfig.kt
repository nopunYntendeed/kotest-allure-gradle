package com.example

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.extensions.allure.AllureTestReporter

class MyConfig : AbstractProjectConfig() {
    override fun listeners() = listOf(AllureTestReporter())
}
