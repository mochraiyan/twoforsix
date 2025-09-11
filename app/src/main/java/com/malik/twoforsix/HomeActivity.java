package com.malik.twoforsix;

import android.os.Bundle;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements ArticleAdapter.OnItemClickListener {

    private List<Article> articleList;

    public static final String EXTRA_TITLE = "EXTRA_TITLE";
    public static final String EXTRA_IMAGE = "EXTRA_IMAGE";
    public static final String EXTRA_SUBTITLE = "EXTRA_SUBTITLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView articlesRecyclerView = findViewById(R.id.articlesRecyclerView);

        initializeData();

        ArticleAdapter articleAdapter = new ArticleAdapter(this, articleList);

        articlesRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        articlesRecyclerView.setAdapter(articleAdapter);

        articleAdapter.setOnItemClickListener(this);
    }

    private void initializeData() {
        articleList = new ArrayList<>();

        articleList.add(new Article(R.drawable.background_test, "Majapahit", "Full content for Majapahit..."));
        articleList.add(new Article(R.drawable.background_test, "Srivijaya", "Full content for Srivijaya..."));
        articleList.add(new Article(R.drawable.background_test, "Mataram", "Full content for Mataram..."));
        articleList.add(new Article(R.drawable.background_test, "Kutai", "Full content for Kutai..."));
        articleList.add(new Article(R.drawable.background_test, "Singhasari", "Full content for Singhasari..."));
        articleList.add(new Article(R.drawable.background_test, "Tarumanagara", "Full content for Tarumanagara..."));
    }

    @Override
    public void onItemClick(Article article) {
        Intent intent = new Intent(this, DetailActivity.class);

        intent.putExtra(EXTRA_IMAGE, article.getImageResource());
        intent.putExtra(EXTRA_TITLE, article.getTitle());
        intent.putExtra(EXTRA_SUBTITLE, article.getSubtitle());

        startActivity(intent);
    }
}