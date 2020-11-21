package com.xwj.word.ui.learn;

import android.support.v4.app.Fragment;

import com.xwj.word.ui.base.fragment.BasePagerFragment;
import com.xwj.word.ui.main.TabBar3Fragment;
import com.xwj.word.ui.main.TabBar4Fragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by goldze on 2018/7/18.
 */

public class LearnFragment extends BasePagerFragment {
    @Override
    protected List<Fragment> pagerFragment() {
        List<Fragment> list = new ArrayList<>();
        list.add(new UnitFragment());
        list.add(new TabBar3Fragment());
        list.add(new TabBar4Fragment());
        return list;
    }
}