package com.androidnavbarheight

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.Promise

abstract class AndroidNavbarHeightSpec internal constructor(context: ReactApplicationContext) :
  ReactContextBaseJavaModule(context) {

  abstract fun getNavigationBarHeightAsync(promise: Promise)
  abstract fun getNavigationBarHeight(): Double
}
