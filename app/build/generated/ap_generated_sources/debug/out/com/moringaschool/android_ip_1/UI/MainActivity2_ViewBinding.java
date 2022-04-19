// Generated code from Butter Knife. Do not modify!
package com.moringaschool.android_ip_1.UI;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.moringaschool.android_ip_1.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity2_ViewBinding implements Unbinder {
  private MainActivity2 target;

  @UiThread
  public MainActivity2_ViewBinding(MainActivity2 target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity2_ViewBinding(MainActivity2 target, View source) {
    this.target = target;

    target.homeBtn = Utils.findRequiredViewAsType(source, R.id.homeBtn, "field 'homeBtn'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity2 target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.homeBtn = null;
  }
}
