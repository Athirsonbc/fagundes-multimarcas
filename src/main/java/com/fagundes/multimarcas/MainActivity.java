package com.fagundes.multimarcas;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://app--fashion-store-manager-30df0b8c.base44.app/login?from_url=https://app--fashion-store-manager-30df0b8c.base44.app/&app_id=67d8b5bc4bf33ca530df0b8c");
    }
}
