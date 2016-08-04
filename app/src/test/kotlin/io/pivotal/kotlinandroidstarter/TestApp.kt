package io.pivotal.kotlinandroidstarter

import io.pivotal.kotlinandroidstarter.component.DaggerTestAppComponent
import io.pivotal.kotlinandroidstarter.module.TestAppModule

class TestApp : App() {

    override fun buildComponent() {
        component = DaggerTestAppComponent.builder().testAppModule(TestAppModule()).build()
    }
}