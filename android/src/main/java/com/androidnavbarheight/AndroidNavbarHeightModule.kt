package com.androidnavbarheight

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise
import com.facebook.react.uimanager.PixelUtil
import android.view.WindowManager
import android.view.Display
import android.view.WindowInsets
import android.os.Build
import android.content.Context
import android.util.DisplayMetrics

class AndroidNavbarHeightModule internal constructor(context: ReactApplicationContext) :
  AndroidNavbarHeightSpec(context) {

  override fun getName(): String {
    return NAME
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  override fun getNavigationBarHeight(): Double {
    val context: Context = getReactApplicationContext()
    val windowManager: WindowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    val display: Display = windowManager.getDefaultDisplay()

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
      val height = windowManager
        .getCurrentWindowMetrics()
        .getWindowInsets()
        .getInsets(WindowInsets.Type.navigationBars())
        .bottom

      return PixelUtil.toDIPFromPixel(height.toFloat()).toDouble()  
    } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
        val metrics = DisplayMetrics()
        display.getMetrics(metrics)
        val usableHeight = metrics.heightPixels
        display.getRealMetrics(metrics)
        val realHeight = metrics.heightPixels
        
        if (realHeight > usableHeight) {
          val diff = (realHeight - usableHeight).toFloat()

          return PixelUtil.toDIPFromPixel(diff).toDouble()
        } else {
          return 0.0
        }
    }

    return 0.0
  }

  @ReactMethod
  override fun getNavigationBarHeightAsync(promise: Promise) {
    promise.resolve(getNavigationBarHeight())
  }

  companion object {
    const val NAME = "AndroidNavbarHeight"
  }
}
