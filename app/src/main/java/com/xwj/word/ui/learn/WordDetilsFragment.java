package com.xwj.word.ui.learn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xwj.word.BR;
import com.xwj.word.R;
import com.xwj.word.databinding.FragmentWordBinding;
import com.xwj.word.databinding.FragmentWorddetilsBinding;

import me.goldze.mvvmhabit.base.BaseFragment;


/**
 * Created by goldze on 2018/7/18.
 */

public class WordDetilsFragment extends BaseFragment<FragmentWorddetilsBinding, WordDetilsViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_worddetils;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        super.initData();
       binding.wordPagerInfoTvProgress.setText("1" + "/" + "20");
        binding.wordPagerInfoTvName.setText("hello");
        binding.wordPagerInfoTvPhEn.setText("英语音标");
        binding.wordPagerInfoTvPhAm.setText("美语音标");
        binding.wordPagerInfoIvPhAmMp3.setTag("mp3_url_en");
        binding.wordPagerInfoPhEnMp3.setTag("mp3_url_am");
    }
}
