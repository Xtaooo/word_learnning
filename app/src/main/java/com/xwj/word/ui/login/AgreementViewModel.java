package com.xwj.word.ui.login;

import android.app.Application;
import android.databinding.ObservableBoolean;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;

import com.google.gson.Gson;
import com.xwj.word.entity.FormEntity;
import com.xwj.word.entity.SpinnerItemData;
import com.xwj.word.ui.base.viewmodel.ToolbarViewModel;
import com.xwj.word.ui.form.FormViewModel;

import java.util.ArrayList;
import java.util.List;

import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.binding.command.BindingConsumer;
import me.goldze.mvvmhabit.binding.viewadapter.spinner.IKeyAndValue;
import me.goldze.mvvmhabit.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.utils.ToastUtils;

/**
 * Created by goldze on 2017/7/17.
 */

public class AgreementViewModel extends ToolbarViewModel {

    public AgreementViewModel.UIChangeObservable uc;

    public class UIChangeObservable {
        //显示日期对话框
        public ObservableBoolean showAgreementObservable;

        public UIChangeObservable() {
            showAgreementObservable = new ObservableBoolean(false);
        }
    }
    public AgreementViewModel(@NonNull Application application) {
        super(application);
    }


    /**
     * 初始化Toolbar
     */
    public void initToolbar(String title) {
        //初始化标题栏
        setRightTextVisible(View.GONE);
            //ID为空是新增
            setTitleText(title);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
