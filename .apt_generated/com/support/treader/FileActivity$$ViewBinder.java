// Generated code from Butter Knife. Do not modify!
package com.support.treader;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class FileActivity$$ViewBinder<T extends com.support.treader.FileActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361933, "field 'btnDelete'");
    target.btnDelete = finder.castView(view, 2131361933, "field 'btnDelete'");
    view = finder.findRequiredView(source, 2131361925, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131361925, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131361932, "field 'btnChooseAll'");
    target.btnChooseAll = finder.castView(view, 2131361932, "field 'btnChooseAll'");
    view = finder.findRequiredView(source, 2131361934, "field 'btnAddFile'");
    target.btnAddFile = finder.castView(view, 2131361934, "field 'btnAddFile'");
    view = finder.findRequiredView(source, 2131361931, "field 'lvFileDrawer'");
    target.lvFileDrawer = finder.castView(view, 2131361931, "field 'lvFileDrawer'");
  }

  @Override public void unbind(T target) {
    target.btnDelete = null;
    target.toolbar = null;
    target.btnChooseAll = null;
    target.btnAddFile = null;
    target.lvFileDrawer = null;
  }
}
