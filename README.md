# SlideListView
拥有侧滑菜单的ListView

# Gif
 ![image](https://github.com/zcw90/SlideListView/blob/master/demo_git/demo_git_1.gif)    ![image](https://github.com/zcw90/SlideListView/blob/master/demo_git/demo_git_2.gif)

# Gradle
```
dependencies{
    ...
    implementation 'com.zcw.listview:slidelistview:0.0.4'
}

```

# Usage
```
// slideMenuItems添加1个SlideMenuItem，就是1个菜单；2个SlideMenuItem，就是2个菜单；最多只能添加3个。
List<SlideMenuItem> slideMenuItems = new ArrayList<>();
slideMenuItems.add(new SlideMenuItem("删除", R.color.button_normal));
slideMenuItems.add(new SlideMenuItem("菜单2", R.color.dialog_content));
slideMenuItems.add(new SlideMenuItem("菜单3", R.color.dialog_content));
listView.setSlideMenu(slideMenuItems, new SlideListView.OnSlideMenuItemClickListener() {
    @Override
    public void slideMenuItemClick(int position, SlideMenuItem menuItem, int index) {
        if(index == 0) {
            data.remove(position);
            adapter.notifyDataSetChanged();
        }
        else if(index == 1) {
        }
        else if(index == 2) {
        }
}
```
