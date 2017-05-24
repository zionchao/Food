package com.kevin.zhangchao.food;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.kevin.zhangchao.food.fragment.FoodSquareFragment;
import com.kevin.zhangchao.food.fragment.MineFoodFragment;
import com.kevin.zhangchao.food.fragment.OrderCenterFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.content)
    public FrameLayout content;

    @BindView(R.id.navigation)
    BottomNavigationView navigation;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager manager=getSupportFragmentManager();

            switch (item.getItemId()) {
                case R.id.navigation_home:
//                    mTextMessage.setText(R.string.title_home);
                    FoodSquareFragment home=new FoodSquareFragment();
                    manager.beginTransaction().replace(R.id.content,home).commit();
                    return true;
                case R.id.navigation_dashboard:
//                    mTextMessage.setText(R.string.title_dashboard);
                    OrderCenterFragment orderCenterFragment=new OrderCenterFragment();
                    manager.beginTransaction().replace(R.id.content,orderCenterFragment).commit();
                    return true;
                case R.id.navigation_notifications:
//                    mTextMessage.setText(R.string.title_notifications);
                    MineFoodFragment mineFood=new MineFoodFragment();
                    manager.beginTransaction().replace(R.id.content,mineFood).commit();

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
