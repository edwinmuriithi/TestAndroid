// Generated code from Butter Knife. Do not modify!
package com.moringaschool.android_ip_1.UI;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.moringaschool.android_ip_1.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MovieCastFragment_ViewBinding implements Unbinder {
  private MovieCastFragment target;

  @UiThread
  public MovieCastFragment_ViewBinding(MovieCastFragment target, View source) {
    this.target = target;

    target.tvCharacter = Utils.findRequiredViewAsType(source, R.id.tvCharacter, "field 'tvCharacter'", TextView.class);
    target.tvActor = Utils.findRequiredViewAsType(source, R.id.tvActor, "field 'tvActor'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MovieCastFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvCharacter = null;
    target.tvActor = null;
  }
}
