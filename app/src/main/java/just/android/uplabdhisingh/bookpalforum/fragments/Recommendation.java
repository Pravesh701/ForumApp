package just.android.uplabdhisingh.bookpalforum.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import just.android.uplabdhisingh.bookpalforum.R;

public class Recommendation extends Fragment
{

    public Recommendation()
    {}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View recommendations_view = inflater.inflate(R.layout.recommendation_fragment,container,false);

        return recommendations_view;
    }
}
