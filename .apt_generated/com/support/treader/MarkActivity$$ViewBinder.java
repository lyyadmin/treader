// Generated code from Butter Knife. Do not modify!
package com.support.treader;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MarkActivity$$ViewBinder<T extends com.support.treader.MarkActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361940, "field 'pager'");
    target.pager = finder.castView(view, 2131361940, "field 'pager'");
    view = finder.findRequiredView(source, 2131361926, "field 'appbar'");
    target.appbar = finder.castView(view, 2131361926, "field 'appbar'");
    view = finder.findRequiredView(source, 2131361925, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131361925, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131361939, "field 'tabs'");
    target.tabs = finder.castView(view, 2131361939, "field 'tabs'");
  }

  @Override public void unbind(T target) {
    target.pager = null;
    target.appbar = null;
    target.toolbar = null;
    target.tabs = null;
  }
}
