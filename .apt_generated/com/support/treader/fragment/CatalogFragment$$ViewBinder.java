// Generated code from Butter Knife. Do not modify!
package com.support.treader.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CatalogFragment$$ViewBinder<T extends com.support.treader.fragment.CatalogFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362007, "field 'lv_catalogue'");
    target.lv_catalogue = finder.castView(view, 2131362007, "field 'lv_catalogue'");
  }

  @Override public void unbind(T target) {
    target.lv_catalogue = null;
  }
}
