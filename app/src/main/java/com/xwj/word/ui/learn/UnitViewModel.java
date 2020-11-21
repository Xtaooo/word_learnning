package com.xwj.word.ui.learn;

import android.app.Application;
import android.support.annotation.NonNull;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;

public class UnitViewModel extends BaseViewModel {
    public UnitViewModel(@NonNull Application application) {
        super(application);
    }

    public BindingCommand startLearnClick = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            startContainerActivity(WordFragment.class.getCanonicalName());
        }
    });
}
