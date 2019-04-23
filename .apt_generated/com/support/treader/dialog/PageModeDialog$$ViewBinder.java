// Generated code from Butter Knife. Do not modify!
package com.support.treader.dialog;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PageModeDialog$$ViewBinder<T extends com.support.treader.dialog.PageModeDialog> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361977, "field 'tv_simulation' and method 'onClick'");
    target.tv_simulation = finder.castView(view, 2131361977, "field 'tv_simulation'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361978, "field 'tv_cover' and method 'onClick'");
    target.tv_cover = finder.castView(view, 2131361978, "field 'tv_cover'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361979, "field 'tv_slide' and method 'onClick'");
    target.tv_slide = finder.castView(view, 2131361979, "field 'tv_slide'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361980, "field 'tv_none' and method 'onClick'");
    target.tv_none = finder.castView(view, 2131361980, "field 'tv_none'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.tv_simulation = null;
    target.tv_cover = null;
    target.tv_slide = null;
    target.tv_none = null;
  }
}
