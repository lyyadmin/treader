// Generated code from Butter Knife. Do not modify!
package com.support.treader;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AboutActivity$$ViewBinder<T extends com.support.treader.AboutActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361921, "field 'appBar' and method 'onClick'");
    target.appBar = finder.castView(view, 2131361921, "field 'appBar'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361920, "field 'coord' and method 'onClick'");
    target.coord = finder.castView(view, 2131361920, "field 'coord'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361923, "field 'bannner' and method 'onClick'");
    target.bannner = finder.castView(view, 2131361923, "field 'bannner'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361924, "field 'tvVersion' and method 'onClick'");
    target.tvVersion = finder.castView(view, 2131361924, "field 'tvVersion'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361922, "field 'toolbarLayout' and method 'onClick'");
    target.toolbarLayout = finder.castView(view, 2131361922, "field 'toolbarLayout'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361925, "field 'toolbar' and method 'onClick'");
    target.toolbar = finder.castView(view, 2131361925, "field 'toolbar'");
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
    target.appBar = null;
    target.coord = null;
    target.bannner = null;
    target.tvVersion = null;
    target.toolbarLayout = null;
    target.toolbar = null;
  }
}
