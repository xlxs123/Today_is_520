package com.jin.android.tadayis520;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * TadayIs520
 * Created by Jin on 2019/5/20.
 * Email:17wjli6@stu.edu.cn
 */
public class ViewFragment extends Fragment {
    public static ViewFragment newInstance() {
        return new ViewFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_view, container, false);
        return v;
    }
}
