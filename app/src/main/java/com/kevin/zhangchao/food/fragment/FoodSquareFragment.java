package com.kevin.zhangchao.food.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kevin.zhangchao.food.R;

/**
 * 美食广场
 * Created by zhangchao_a on 2017/5/24.
 */

public class FoodSquareFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_food_square,container,false);
        return view;
    }
}
