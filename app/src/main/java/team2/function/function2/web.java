package team2.function.function2;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class web extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);

        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com/");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);



//        WebSettings webSettings = page.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        webSettings.setDomStorageEnabled(true);
//        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
//        webSettings.setSupportMultipleWindows(true);
//        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
//        webSettings.setDefaultZoom(WebSettings.ZoomDensity.FAR);
//        webSettings.setSupportZoom(true);
//        webSettings.setCacheMode(2);
//        webSettings.setBuiltInZoomControls(true);
//        webSettings.setJavaScriptEnabled(true);
//        webSettings.setAppCacheEnabled(false);


//        webSettings.setAppCacheEnabled(true);
//        webSettings.setAllowFileAccess(true);
//        webSettings.setAppCacheMaxSize(10 * 1024 * 1024);
//        webSettings.setAppCachePath("");
//        webSettings.setDatabaseEnabled(true);
//        webSettings.setDomStorageEnabled(true);
//        webSettings.setGeolocationEnabled(true);
//        webSettings.setSaveFormData(false);
//        webSettings.setSavePassword(false);
//        webSettings.setLightTouchEnabled(true);
//        webSettings.setRenderPriority(WebSettings.RenderPriority.HIGH);
//        // Flash settings
//        webSettings.setPluginState(WebSettings.PluginState.ON);
//
//        // Geo location settings
//        webSettings.setGeolocationEnabled(true);
//        webSettings.setGeolocationDatabasePath("/data/data/selendroid");
//        if (Build.VERSION.SDK_INT >= 28) {
//            webSettings.setAllowUniversalAccessFromFileURLs(true);
//            webSettings.setAllowFileAccessFromFileURLs(true);
//
//
//        }
//        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);


    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}