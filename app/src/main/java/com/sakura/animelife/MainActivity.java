package com.sakura.animelife;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.rgb(255, 220, 235));
        layout.setPadding(30, 30, 30, 30);

        TextView title = new TextView(this);
        title.setText("🌸 Sakura Anime Life 🌸");
        title.setTextSize(28);
        title.setTextColor(Color.rgb(180, 50, 110));
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("Welcome to your anime life!");
        subtitle.setTextSize(18);
        subtitle.setTextColor(Color.DKGRAY);
        subtitle.setGravity(Gravity.CENTER);

        layout.addView(title);
        layout.addView(subtitle);

        setContentView(layout);
    }
}
