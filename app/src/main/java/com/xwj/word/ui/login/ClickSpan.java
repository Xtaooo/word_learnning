package com.xwj.word.ui.login;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.xwj.word.ui.form.FormFragment;
import com.xwj.word.ui.main.SplashActivity;
import com.xwj.word.ui.network.NetWorkFragment;

import me.goldze.mvvmhabit.base.ContainerActivity;

/**
 * Created by wangjw on 16/11/3.
 */

public class ClickSpan extends ClickableSpan {

    private Context mContext;
    private int mAtIndex; //@的位置

    public ClickSpan(Context context, int atIndex) {
        mContext = context;
        mAtIndex = atIndex;
    }

    @Override
    public void onClick(View widget) {
        if (widget instanceof TextView) {
            TextView textView = (TextView) widget;
            Log.d("SpanContent", "Content = " + textView.getText().toString());

            String str = textView.getText().toString();
            int sIndex = str.indexOf("》", mAtIndex); //找到@后的第一个空格
            Toast.makeText(mContext, str.substring(mAtIndex + 1, sIndex), Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(mContext, ContainerActivity.class);
            intent.putExtra(ContainerActivity.FRAGMENT, AgreementFragment.class.getCanonicalName());
            Bundle mBundle = new Bundle();
            mBundle.putString("title", str.substring(mAtIndex + 1, sIndex));
            intent.putExtra(ContainerActivity.BUNDLE, mBundle);
            mContext.startActivity(intent);
        }
    }

    @Override
    public void updateDrawState(TextPaint ds) {
        super.updateDrawState(ds);
        ds.setColor(Color.BLUE);
        ds.setUnderlineText(false);
        ds.clearShadowLayer();
    }

}