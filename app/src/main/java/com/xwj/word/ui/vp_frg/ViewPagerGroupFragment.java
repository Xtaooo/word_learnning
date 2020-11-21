package com.xwj.word.ui.vp_frg;

import android.support.v4.app.Fragment;


import com.xwj.word.ui.base.fragment.BasePagerFragment;
import com.xwj.word.ui.learn.LearnFragment;
import com.xwj.word.ui.main.TabBar2Fragment;
import com.xwj.word.ui.main.TabBar3Fragment;
import com.xwj.word.ui.main.TabBar4Fragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Create Author：goldze
 * Create Date：2019/01/25
 * Description：ViewPager+Fragment的实现
 */

public class ViewPagerGroupFragment extends BasePagerFragment {
    @Override
    protected List<Fragment> pagerFragment() {
        List<Fragment> list = new ArrayList<>();
        list.add(new LearnFragment());
        list.add(new TabBar2Fragment());
        list.add(new TabBar3Fragment());
        list.add(new TabBar4Fragment());
        return list;
    }
}
