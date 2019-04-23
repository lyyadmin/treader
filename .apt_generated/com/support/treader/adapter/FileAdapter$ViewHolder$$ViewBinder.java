// Generated code from Butter Knife. Do not modify!
package com.support.treader.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class FileAdapter$ViewHolder$$ViewBinder<T extends com.support.treader.adapter.FileAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361959, "field 'checkBox'");
    target.checkBox = finder.castView(view, 2131361959, "field 'checkBox'");
    view = finder.findRequiredView(source, 2131361956, "field 'fileIcon'");
    target.fileIcon = finder.castView(view, 2131361956, "field 'fileIcon'");
    view = finder.findRequiredView(source, 2131361957, "field 'textView'");
    target.textView = finder.castView(view, 2131361957, "field 'textView'");
    view = finder.findRequiredView(source, 2131361958, "field 'textSize'");
    target.textSize = finder.castView(view, 2131361958, "field 'textSize'");
    view = finder.findRequiredView(source, 2131361955, "field 'linearLayout'");
    target.linearLayout = finder.castView(view, 2131361955, "field 'linearLayout'");
  }

  @Override public void unbind(T target) {
    target.checkBox = null;
    target.fileIcon = null;
    target.textView = null;
    target.textSize = null;
    target.linearLayout = null;
  }
}
