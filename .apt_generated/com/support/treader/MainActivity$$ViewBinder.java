// Generated code from Butter Knife. Do not modify!
package com.support.treader;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.support.treader.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361937, "field 'drawer'");
    target.drawer = finder.castView(view, 2131361937, "field 'drawer'");
    view = finder.findRequiredView(source, 2131361925, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131361925, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131361961, "field 'fab'");
    target.fab = finder.castView(view, 2131361961, "field 'fab'");
    view = finder.findRequiredView(source, 2131361938, "field 'navigationView'");
    target.navigationView = finder.castView(view, 2131361938, "field 'navigationView'");
    view = finder.findRequiredView(source, 2131361960, "field 'bookShelf'");
    target.bookShelf = finder.castView(view, 2131361960, "field 'bookShelf'");
  }

  @Override public void unbind(T target) {
    target.drawer = null;
    target.toolbar = null;
    target.fab = null;
    target.navigationView = null;
    target.bookShelf = null;
  }
}
