package com.test.app.shared_navigation
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class NavigationQualifier(val name: String)

interface NavigationProvider {
    fun navigateTo(path: String)
}
