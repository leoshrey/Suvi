package com.kalvifunlearning.suvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kalvifunlearning.suvi.databinding.ActivityTypeSelectionBinding;

public class TypeSelectionActivity extends AppCompatActivity {

    ActivityTypeSelectionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTypeSelectionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.studentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TypeSelectionActivity.this, TeacherSignUpActivity.class));
            }
        });

        binding.teacherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TypeSelectionActivity.this, TeacherSignUpActivity.class));
            }
        });

    }
}