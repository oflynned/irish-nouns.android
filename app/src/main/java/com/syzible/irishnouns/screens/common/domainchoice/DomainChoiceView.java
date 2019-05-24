package com.syzible.irishnouns.screens.common.domainchoice;

import com.hannesdorfmann.mosby3.mvp.MvpView;
import com.syzible.irishnouns.common.models.Category;

import java.util.List;

interface DomainChoiceView extends MvpView {
    void showCategoryList(List<Category> categoryList, int selectedIndex);
}
