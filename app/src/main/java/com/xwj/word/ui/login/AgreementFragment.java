package com.xwj.word.ui.login;


import android.databinding.Observable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.xwj.word.BR;
import com.xwj.word.R;
import com.xwj.word.databinding.FragmentAgreementBinding;
import com.xwj.word.entity.FormEntity;

import me.goldze.mvvmhabit.base.BaseFragment;

/**
 * Created by goldze on 2017/7/17.
 * 表单提交/编辑界面
 */

public class AgreementFragment extends BaseFragment<FragmentAgreementBinding, AgreementViewModel> {

    private String title ;

    @Override
    public void initParam() {
        //获取列表传入的实体
        Bundle mBundle = getArguments();
        if (mBundle != null) {
            title = mBundle.getString("title");
        }
    }

    @Override
    public int initContentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return R.layout.fragment_agreement;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        //通过binding拿到toolbar控件, 设置给Activity
        ((AppCompatActivity) getActivity()).setSupportActionBar(binding.include.toolbar);
        //初始化标题
        viewModel.initToolbar(title);
        if (title.equals("用户协议")) {
            binding.webView.loadUrl("file:///android_asset/user_notice.html");
        } else {
            binding.webView.loadUrl("file:///android_asset/user_privacy.html");
        }

    }


}
