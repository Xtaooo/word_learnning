package com.xwj.word.ui.base.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xwj.word.R;
import com.xwj.word.BR;
import com.xwj.word.databinding.FragmentBasePagerBinding;
import com.xwj.word.databinding.FragmentLearnBinding;
import com.xwj.word.ui.base.adapter.BaseFragmentPagerAdapter;

import java.util.List;

import me.goldze.mvvmhabit.base.BaseFragment;
import me.goldze.mvvmhabit.base.BaseViewModel;

/**
 * Created by goldze on 2017/7/17.
 * 抽取的二级BasePagerFragment
 */

public abstract class BasePagerFragment extends BaseFragment<FragmentLearnBinding, BaseViewModel> {

    private List<Fragment> mFragments;

    protected abstract List<Fragment> pagerFragment();

    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_learn;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        mFragments = pagerFragment();
        //设置Adapter
        BaseFragmentPagerAdapter pagerAdapter = new BaseFragmentPagerAdapter(getChildFragmentManager(), mFragments);
        binding.viewPager.setAdapter(pagerAdapter);
        binding.viewPager.setNoScroll(false);
        binding.llMyclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.viewPager.setCurrentItem(0);
            }
        });
        binding.wordBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.viewPager.setCurrentItem(1);
            }
        });
        binding.wrongBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.viewPager.setCurrentItem(2);
            }
        });
    }

    @Override
    public void initViewObservable() {

    }
}
