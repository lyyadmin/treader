// Generated code from Butter Knife. Do not modify!
package com.support.treader.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ShelfAdapter$ViewHolder$$ViewBinder<T extends com.support.treader.adapter.ShelfAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362036, "field 'deleteItem_IB'");
    target.deleteItem_IB = finder.castView(view, 2131362036, "field 'deleteItem_IB'");
    view = finder.findRequiredView(source, 2131362035, "field 'name'");
    target.name = finder.castView(view, 2131362035, "field 'name'");
  }

  @Override public void unbind(T target) {
    target.deleteItem_IB = null;
    target.name = null;
  }
}
