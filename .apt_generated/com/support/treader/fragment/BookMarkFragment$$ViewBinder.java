// Generated code from Butter Knife. Do not modify!
package com.support.treader.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BookMarkFragment$$ViewBinder<T extends com.support.treader.fragment.BookMarkFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362006, "field 'lv_bookmark'");
    target.lv_bookmark = finder.castView(view, 2131362006, "field 'lv_bookmark'");
  }

  @Override public void unbind(T target) {
    target.lv_bookmark = null;
  }
}
