package com.example.pruebafirebass;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pruebafirebass.utils.TaskImg;
import com.google.android.gms.tasks.Task;

public class result_login extends AppCompatActivity {
    String avatar;
    String email;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_login);
        avatar=getIntent().getExtras().getString("avatar");
        email=getIntent().getExtras().getString("email");
        name=getIntent().getExtras().getString("name");
        loadComponents();

    }

    private void loadComponents() {
        TextView emailtxt=findViewById(R.id.email);
        TextView nametxt=findViewById(R.id.name);
        ImageView avatarimg=findViewById(R.id.avatar);
        emailtxt.setText(email+" "+avatar);
        nametxt.setText(name);
        avatar="http://192.168.211.131:8000/images/ejemplo.jpeg";
        TaskImg loadImg=new TaskImg();
        loadImg.execute(avatar);
        loadImg.setLoadImage(avatarimg);


    }
}
