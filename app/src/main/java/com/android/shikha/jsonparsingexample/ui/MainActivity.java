package com.android.shikha.jsonparsingexample.ui;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.android.shikha.jsonparsingexample.R;
import com.android.shikha.jsonparsingexample.framework.object.MainObject;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;


public class MainActivity extends ActionBarActivity {

    TextView mtext;
    Gson gson ;
    String jsonString;
    MainObject jsonObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inilializeComponent();

          }

    private void inilializeComponent() {
        mtext = (TextView) findViewById(R.id.text);
        gson=new Gson();
        jsonString = loadJSONFromAsset(this);
        //mtext.setText("Json:"+jsonString);
        jsonObject=gson.fromJson(jsonString, MainObject.class);
        mtext.setText("Lenth:"+jsonObject.getResults().length+"\n Status:"+jsonObject.getStatus());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public String loadJSONFromAsset(Context context) {
        String json = null;
        try {
            InputStream is = context.getAssets().open("machineteset_json.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
