package com.example.singleton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.singleton.databinding.ActivityAnasayfaBinding;

public class Anasayfa extends AppCompatActivity {
    private ActivityAnasayfaBinding	binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =	ActivityAnasayfaBinding.inflate(getLayoutInflater());
        View view	=	binding.getRoot();
        setContentView(R.layout.activity_anasayfa);
        String	kullaniciAdi	=	Singleton.getInstance().getKullaniciAdi();
        String	parola	=	Singleton.getInstance().getKullaniciParola();
        binding.textViewKullaniciAdi.setText(kullaniciAdi);
        binding.textViewKullaniciSifresi.setText(parola);
    }
}