package com.example.singleton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.singleton.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(R.layout.activity_main);
    }

    public void kullaniciGirisi(View view) {
        String kullaniciAdi = binding.e1.getText().toString();
        String parola = binding.e2.getText().toString();
        Singleton singleton = Singleton.getInstance();
        singleton.setKullaniciAdi(kullaniciAdi);
        singleton.setKullaniciParola(parola);
        Intent intent = new Intent(this, Anasayfa.class);
        startActivity(intent);

    }
}