package just.android.uplabdhisingh.bookpalforum.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import just.android.uplabdhisingh.bookpalforum.R;

public class Forum extends Fragment
{

    public Forum()
    {}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View forum_view = inflater.inflate(R.layout.forum_fragment,container,false);
        return forum_view;
    }
}
