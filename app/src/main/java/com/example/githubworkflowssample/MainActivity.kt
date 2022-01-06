package com.example.githubworkflowssample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var lottieAnimView: LottieAnimationView = findViewById(R.id.animView)
        lottieAnimView.playAnimation()




    }
}