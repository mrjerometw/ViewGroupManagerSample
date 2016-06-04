package com.viewgroupmanagersample;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.ViewGroup;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;

/**
 * Created by jerome on 2016/6/4.
 */
public class ImageViewGroupManager extends ViewGroupManager<ImageViewGroup> {
    public static final String REACT_CLASS = "ImageViewGroupManager";
    private Context mContext;
    public ImageViewGroupManager(ReactApplicationContext reactContext)
    {
        mContext = reactContext;
    }
    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected ImageViewGroup createViewInstance(ThemedReactContext reactContext) {

        return new ImageViewGroup(mContext);
    }

}