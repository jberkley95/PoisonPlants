package com.example.fsdgeniusacadamy.poisonplants;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class OCActivity extends AppCompatActivity {

    ImageView poisonOak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oc);

        poisonOak = (ImageView) findViewById(R.id.img_poisonoak);
        poisonOak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Toxicodendron_diversilobum"));
                startActivity(browserIntent);
            }
        });
    }
}
