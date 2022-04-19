// Generated code from Butter Knife. Do not modify!
package com.moringaschool.android_ip_1.UI;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.moringaschool.android_ip_1.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MovieCastActivity_ViewBinding implements Unbinder {
  private MovieCastActivity target;

  @UiThread
  public MovieCastActivity_ViewBinding(MovieCastActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MovieCastActivity_ViewBinding(MovieCastActivity target, View source) {
    this.target = target;

    target.mViewPager = Utils.findRequiredViewAsType(source, R.id.viewPager, "field 'mViewPager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MovieCastActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mViewPager = null;
  }
}
