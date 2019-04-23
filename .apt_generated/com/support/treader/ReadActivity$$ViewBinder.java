// Generated code from Butter Knife. Do not modify!
package com.support.treader;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ReadActivity$$ViewBinder<T extends com.support.treader.ReadActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361941, "field 'bookpage'");
    target.bookpage = finder.castView(view, 2131361941, "field 'bookpage'");
    view = finder.findRequiredView(source, 2131361944, "field 'rl_bottom' and method 'onClick'");
    target.rl_bottom = finder.castView(view, 2131361944, "field 'rl_bottom'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361946, "field 'tv_progress' and method 'onClick'");
    target.tv_progress = finder.castView(view, 2131361946, "field 'tv_progress'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361945, "field 'rl_progress' and method 'onClick'");
    target.rl_progress = finder.castView(view, 2131361945, "field 'rl_progress'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361948, "field 'tv_pre' and method 'onClick'");
    target.tv_pre = finder.castView(view, 2131361948, "field 'tv_pre'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361950, "field 'tv_next' and method 'onClick'");
    target.tv_next = finder.castView(view, 2131361950, "field 'tv_next'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361926, "field 'appbar'");
    target.appbar = finder.castView(view, 2131361926, "field 'appbar'");
    view = finder.findRequiredView(source, 2131361954, "field 'tv_setting' and method 'onClick'");
    target.tv_setting = finder.castView(view, 2131361954, "field 'tv_setting'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361943, "field 'tv_stop_read' and method 'onClick'");
    target.tv_stop_read = finder.castView(view, 2131361943, "field 'tv_stop_read'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361925, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131361925, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131361942, "field 'rl_read_bottom'");
    target.rl_read_bottom = finder.castView(view, 2131361942, "field 'rl_read_bottom'");
    view = finder.findRequiredView(source, 2131361949, "field 'sb_progress' and method 'onClick'");
    target.sb_progress = finder.castView(view, 2131361949, "field 'sb_progress'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361951, "field 'tv_directory' and method 'onClick'");
    target.tv_directory = finder.castView(view, 2131361951, "field 'tv_directory'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361952, "field 'tv_dayornight' and method 'onClick'");
    target.tv_dayornight = finder.castView(view, 2131361952, "field 'tv_dayornight'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361953, "field 'tv_pagemode' and method 'onClick'");
    target.tv_pagemode = finder.castView(view, 2131361953, "field 'tv_pagemode'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131361947, "field 'bookpop_bottom' and method 'onClick'");
    target.bookpop_bottom = finder.castView(view, 2131361947, "field 'bookpop_bottom'");
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
    target.bookpage = null;
    target.rl_bottom = null;
    target.tv_progress = null;
    target.rl_progress = null;
    target.tv_pre = null;
    target.tv_next = null;
    target.appbar = null;
    target.tv_setting = null;
    target.tv_stop_read = null;
    target.toolbar = null;
    target.rl_read_bottom = null;
    target.sb_progress = null;
    target.tv_directory = null;
    target.tv_dayornight = null;
    target.tv_pagemode = null;
    target.bookpop_bottom = null;
  }
}
