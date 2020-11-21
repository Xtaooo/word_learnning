package com.xwj.word.ui.learn;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xwj.word.BR;
import com.xwj.word.R;
import com.xwj.word.data.Repository;
import com.xwj.word.databinding.FragmentLearnBinding;
import com.xwj.word.databinding.FragmentWordBinding;
import com.xwj.word.entity.WordEntity;
import com.xwj.word.ui.base.adapter.BaseFragmentPagerAdapter;
import com.xwj.word.ui.main.TabBar3Fragment;
import com.xwj.word.ui.main.TabBar4Fragment;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import me.goldze.mvvmhabit.base.BaseFragment;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.utils.RxUtils;
import me.goldze.mvvmhabit.utils.ToastUtils;


public class WordViewModel extends BaseViewModel<Repository> {


    public WordViewModel(@NonNull Application application, Repository model) {
        super(application, model);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //initData();
    }

    public void initData(){

        /*addSubscribe(model.getWordList("hello","74643EB04A8966177265CB4312E80609")
                .compose(RxUtils.schedulersTransformer()) //线程调度
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        showDialog();
                    }
                })
                .subscribe(new Consumer<WordEntity>() {
                    @Override
                    public void accept(WordEntity entity) throws Exception {
                    ToastUtils.showShort(entity.getName().toString());
                    }
                }));*/
    }

}