package com.example.android.popular_movies_stage_1;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MovieAdapter extends ArrayAdapter<Movie> {

    public MovieAdapter(Context context, List<Movie> movies) {
        super(context, 0, movies);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView==null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.movie_item, parent, false);
        }

        // Find the movie at the given location in the list
        Movie currentMovie = getItem(position);

        // Find the TextView with web_title
        TextView movieTitle = listItemView.findViewById(R.id.title_text_view);

        // Display the article title of the current article in that TextView
        movieTitle.setText(currentMovie.getTitle());

        // Find the TextView with web_title
        TextView movieYearView = listItemView.findViewById(R.id.year_text_view);

        // Display the article title of the current article in that TextView
        movieYearView.setText(currentMovie.getDate());

        // Find the TextView with web_title
        TextView movieVoteView = listItemView.findViewById(R.id.rating_text_view);

        // Display the article title of the current article in that TextView
        movieVoteView.setText(currentMovie.getVote());

        // Find the TextView with web_title
        TextView movieOverView = listItemView.findViewById(R.id.summary_text_view);

        // Display the article title of the current article in that TextView
        movieOverView.setText(currentMovie.getOverview());

        // Find the TextView with author
        TextView moviePosterView = listItemView.findViewById(R.id.movie_image_detail);

        // Display the author title of the current article in that TextView
        moviePosterView.setText(currentMovie.getPoster());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
