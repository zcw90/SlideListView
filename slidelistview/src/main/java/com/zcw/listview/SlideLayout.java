package com.zcw.listview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 朱城委 on 2018/11/12.<br><br>
 * 侧滑布局
 */
public class SlideLayout extends ConstraintLayout {

    /** 显示内容的View */
    private View contentView;

    private List<SlideMenuItem> slideMenuItems;

    private List<TextView> slideMenuViews;

    public SlideLayout(Context context) {
        super(context);
    }

    public SlideLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SlideLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public View getContentView() {
        return contentView;
    }

    public void setContentView(View contentView) {
        this.contentView = contentView;
    }

    public List<SlideMenuItem> getSlideMenuItems() {
        return slideMenuItems;
    }

    public void setSlideMenuItems(List<SlideMenuItem> menuItems) {
        if(menuItems == null) {
            return ;
        }

        TypedArray typedArray = getContext().getResources().obtainTypedArray(R.array.slide_menu_ids);
        int[] menuViewIds = new int[typedArray.length()];
        for(int i = 0; i < typedArray.length(); i++) {
            menuViewIds[i] = typedArray.getResourceId(i, i);
        }

        // 设置侧滑菜单
        slideMenuItems = menuItems;
        slideMenuViews = new ArrayList<>();
        for(int i = 0; i < slideMenuItems.size() && i < 3; i++) {
            SlideMenuItem menuItem = slideMenuItems.get(i);

            TextView menuView = new TextView(getContext());
            menuView.setId(menuViewIds[i]);
            menuView.setText(menuItem.getContent());
            menuView.setTextColor(getContext().getResources().getColor(android.R.color.white));
            menuView.setBackgroundResource(menuItem.getBgColorResId());
            menuView.setGravity(Gravity.CENTER);

            ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(menuItem.getMenuWidth(), 0);
            if(i == 0) {
                params.leftToRight = ConstraintLayout.LayoutParams.PARENT_ID;
            }
            else {
                params.leftToRight = slideMenuViews.get(i - 1).getId();
            }
            params.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
            params.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;
            menuView.setLayoutParams(params);
            addView(menuView);

            slideMenuViews.add(menuView);
        }
    }

    public List<TextView> getSlideMenuViews() {
        if(slideMenuViews == null) {
            return new ArrayList<>();
        }
        return slideMenuViews;
    }

    public void setSlideMenuViews(List<TextView> slideMenuViews) {
        this.slideMenuViews = slideMenuViews;
    }
}
