package com.kaplan.pdma.japanesebasicphrases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class hundred extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hundred);

        WebView webView = (WebView) findViewById(R.id.webView); //link to website in app

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://jisho.org/");
    }
}
