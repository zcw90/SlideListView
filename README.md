# SlideListView
拥有侧滑菜单的ListView

# Gradle
```
dependencies{
    ...
    implementation 'com.zcw.listview:slidelistview:0.0.4'
}

```

#Usage
```
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