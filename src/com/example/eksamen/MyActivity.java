package com.example.eksamen;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.InputStream;

public class MyActivity extends Activity {
    private Context context;
    private final String TAG = "Eksamen";
    private WebView webView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        context = this;
        webView = (WebView) findViewById(R.id.webviewActionView);
        webView.loadUrl(getResources().getString(R.string.kittenURL));
        initMoarKittensButton();
    }

    public void initMoarKittensButton(){
        Button moarKittens = (Button) findViewById(R.id.moarkittensButton);
        moarKittens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl(getResources().getString(R.string.kittenURL));
            }
        });
    }
}
