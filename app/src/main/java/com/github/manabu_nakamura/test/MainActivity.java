package com.github.manabu_nakamura.test;

import android.os.Bundle;
import android.view.View;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.manabu_nakamura.test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.appBar);
    }

    public void photoPicker(View view) {
        activityResultLauncher.launch(new PickVisualMediaRequest.Builder().build());
    }

    private ActivityResultLauncher<PickVisualMediaRequest> activityResultLauncher = registerForActivityResult(new ActivityResultContracts.PickVisualMedia(), result -> {
    });
}