package com.example.family.example;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
//import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.PopupMenu;

public class Activity2 extends ActionBarActivity {

    public static final String TAG = "TimeLineActivity";

    private static final String baseURl = "https://twitter.com";

    private static final String widgetInfo = "<a class=\"twitter-timeline\" href=\"https://twitter.com/accountmmlab\" data-widget-id=\"653183178392399872\"data-chrome=\"noborders\"></a>"+
            "<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+\"://platform.twitter.com/widgets.js\";fjs.parentNode.insertBefore(js,fjs);}}(document,\"script\",\"twitter-wjs\");</script>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        load_background_color();

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadDataWithBaseURL(baseURl, widgetInfo, "text/html", "UTF-8", null);
    }


    private void load_background_color() {
        WebView webView = (WebView) findViewById(R.id.webView);
        //webView.setBackgroundColor(getResources().getColor(R.color.twitter_dark));
        webView.setBackgroundColor(0); // transparent
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

}







