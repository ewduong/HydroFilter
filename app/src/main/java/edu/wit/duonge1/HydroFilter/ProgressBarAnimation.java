package edu.wit.duonge1.HydroFilter;

import android.view.animation.Animation;
import android.view.animation.Transformation;

import com.akexorcist.roundcornerprogressbar.IconRoundCornerProgressBar;

/**
 * Created by pizza on 7/31/2016.
 */
public class ProgressBarAnimation extends Animation {
    private IconRoundCornerProgressBar progressBar;
    private float from;
    private float  to;

    public ProgressBarAnimation(IconRoundCornerProgressBar progressBar, float from, float to) {
        super();
        this.progressBar = progressBar;
        this.from = from;
        this.to = to;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        float value = from + (to - from) * interpolatedTime;
        progressBar.setProgress((int) value);
    }

}