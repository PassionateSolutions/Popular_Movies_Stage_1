package com.example.android.popular_movies_stage_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

// Followed the walkthrough of @Gill AND from Slack.  His video on Youtube helped me follow the direction
// to implement the working code.

public class Details extends AppCompatActivity {

    private static final String BASE_URL = "https://image.tmdb.org/t/p/w185";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent = getIntent();
        Movie movie = intent.getParcelableExtra("movie");
        TextView title = findViewById(R.id.title_text_view);
        title.setText(movie.getTitle());
        ImageView poster = findViewById(R.id.movie_image_detail);
        String posterPath = movie.getPoster();
        Picasso.with(this).load(BASE_URL + posterPath).into(poster);
        TextView date = findViewById(R.id.year_text_view);
        String releaseYear = movie.getDate();
        if (releaseYear.length() > 4) releaseYear = releaseYear.substring(0, 4);
        date.setText(releaseYear);
        TextView vote = findViewById(R.id.rating_text_view);
        String voteAverage = movie.getVote();
        vote.setText(voteAverage);
        TextView overview = findViewById(R.id.summary_text_view);
        overview.setText(movie.getOverview());

    }
}
