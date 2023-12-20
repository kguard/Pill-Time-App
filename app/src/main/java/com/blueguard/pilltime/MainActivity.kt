package com.blueguard.pilltime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.blueguard.pilltime.ui.PillTimeApp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var gap = false

        val splashScreen = installSplashScreen()

        super.onCreate(savedInstanceState)

        lifecycleScope.launch {
            lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED){
                //여기서 원하는 작업할때까지 대기할 수 있으며,
                delay(1500L)
                gap = true
            }
        }

        splashScreen.setKeepOnScreenCondition{
            // gap을 옵져버하고있기 때문에 변화를 감지해서 넘어갈 수 있음
            if(gap) false
            else true
        }

        setContent {
            PillTimeApp()
        }
    }
}