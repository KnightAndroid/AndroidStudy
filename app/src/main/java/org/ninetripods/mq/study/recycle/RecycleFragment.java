package org.ninetripods.mq.study.recycle;


import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.ninetripods.mq.study.R;
import org.ninetripods.mq.study.util.NavitateUtil;
import org.ninetripods.mq.study.viewpager2.ViewPager2Activity;

public class RecycleFragment extends Fragment implements View.OnClickListener {
    private TextView tv_contacts, tv_swipe_menu, tv_water_fall, tv_touch_helper, tv_refresh;
    private TextView tv_view_pager2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_recycle, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tv_contacts = (TextView) view.findViewById(R.id.tv_contacts);
        tv_swipe_menu = (TextView) view.findViewById(R.id.tv_swipe_menu);
        tv_water_fall = (TextView) view.findViewById(R.id.tv_water_fall);
        tv_touch_helper = (TextView) view.findViewById(R.id.tv_touch_helper);
        tv_refresh = (TextView) view.findViewById(R.id.tv_refresh);
        tv_view_pager2 = view.findViewById(R.id.tv_view_pager2);
        tv_contacts.setOnClickListener(this);
        tv_swipe_menu.setOnClickListener(this);
        tv_water_fall.setOnClickListener(this);
        tv_touch_helper.setOnClickListener(this);
        tv_refresh.setOnClickListener(this);
        tv_view_pager2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_contacts:
                NavitateUtil.startActivity(getActivity(), ContactsActivity.class);
                break;
            case R.id.tv_swipe_menu:
                NavitateUtil.startActivity(getActivity(), SwipeMenuActivity.class);
                break;
            case R.id.tv_water_fall:
                NavitateUtil.startActivity(getActivity(), WaterFallActivity.class);
                break;
            case R.id.tv_view_pager2:
                NavitateUtil.startActivity(getActivity(), ViewPager2Activity.class);
                break;
            case R.id.tv_touch_helper:
                break;
//            case R.id.tv_refresh:
//                NavitateUtil.startActivity(getActivity(), PullToRefreshActivity.class);
//                break;
        }
    }
}
