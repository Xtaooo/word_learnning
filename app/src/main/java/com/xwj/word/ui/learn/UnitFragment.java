package com.xwj.word.ui.learn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.xwj.word.BR;
import com.xwj.word.R;

import com.xwj.word.databinding.FragmentUnitBinding;

import me.goldze.mvvmhabit.base.BaseFragment;

/**
 * Created by goldze on 2018/7/18.
 */

public class UnitFragment extends BaseFragment<FragmentUnitBinding,UnitViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_unit;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

}
