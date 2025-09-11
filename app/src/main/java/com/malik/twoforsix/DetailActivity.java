package com.malik.twoforsix;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.appbar.MaterialToolbar;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        MaterialToolbar toolbar = findViewById(R.id.detailTopAppBar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();

        int imageRes = intent.getIntExtra(HomeActivity.EXTRA_IMAGE, 0);
        String title = intent.getStringExtra(HomeActivity.EXTRA_TITLE);
        String content = intent.getStringExtra(HomeActivity.EXTRA_SUBTITLE);

        ImageView imageView = findViewById(R.id.detailImageView);
        TextView titleView = findViewById(R.id.detailTitleTextView);
        TextView contentView = findViewById(R.id.detailContentTextView);

        if (imageRes != 0) {
            imageView.setImageResource(imageRes);
        }
        titleView.setText(title);
        contentView.setText(content);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}