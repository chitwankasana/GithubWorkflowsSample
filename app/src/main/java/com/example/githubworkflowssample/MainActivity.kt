package com.example.githubworkflowssample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.airbnb.lottie.LottieAnimationView
import android.webkit.WebViewClient




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        var lottieAnimView: LottieAnimationView = findViewById(R.id.animView)
//        lottieAnimView.playAnimation()

        var webView: NoSuggestionsWebView = findViewById(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true

        webView.loadUrl("https://www.google.com")
        webView.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                webView.loadUrl("javascript:document.body.style.margin=\"8%\"; void 0")
            }
        }



    }
}