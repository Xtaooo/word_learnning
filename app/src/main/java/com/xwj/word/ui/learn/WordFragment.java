package com.xwj.word.ui.learn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.xwj.word.BR;
import com.xwj.word.R;
import com.xwj.word.databinding.FragmentWordBinding;
import com.xwj.word.ui.base.adapter.BaseFragmentPagerAdapter;
import com.xwj.word.ui.viewpager.ZoomOutPagerTransformer;

import java.util.ArrayList;
import java.util.List;

import me.goldze.mvvmhabit.base.BaseFragment;
import me.goldze.mvvmhabit.base.BaseViewModel;


/**
 * Created by goldze on 2018/7/18.
 */

public class WordFragment extends BaseFragment<FragmentWordBinding, BaseViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_word;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        /*((AppCompatActivity) getActivity()).setSupportActionBar(binding.include.toolbar);
        //初始化标题
        binding.include.ivRightIcon.setVisibility(View.GONE);
        binding.include.tvTitle.setText("单词学习");*/
        List<Fragment> list = new ArrayList<>();
        list.add(new WordDetilsFragment());
        list.add(new WordDetilsFragment());
        list.add(new WordDetilsFragment());
        BaseFragmentPagerAdapter pagerAdapter = new BaseFragmentPagerAdapter(getChildFragmentManager(), list);
        binding.viewPager.setAdapter(pagerAdapter);
        binding.viewPager.setOffscreenPageLimit(2);
        binding.viewPager.setPageMargin(10);
        binding.viewPager.setPageTransformer(true, new ZoomOutPagerTransformer());
    }
}
