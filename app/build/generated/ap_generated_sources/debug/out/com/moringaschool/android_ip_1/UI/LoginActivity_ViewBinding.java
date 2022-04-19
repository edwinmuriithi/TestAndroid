// Generated code from Butter Knife. Do not modify!
package com.moringaschool.android_ip_1.UI;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.moringaschool.android_ip_1.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target, View source) {
    this.target = target;

    target.tvSignUp = Utils.findRequiredViewAsType(source, R.id.tvSignUp, "field 'tvSignUp'", TextView.class);
    target.clContinue = Utils.findRequiredViewAsType(source, R.id.clContinue, "field 'clContinue'", ConstraintLayout.class);
    target.tvLoginPassword = Utils.findRequiredViewAsType(source, R.id.tvLoginPassword, "field 'tvLoginPassword'", TextView.class);
    target.tvLoginEmail = Utils.findRequiredViewAsType(source, R.id.tvLoginEmail, "field 'tvLoginEmail'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvSignUp = null;
    target.clContinue = null;
    target.tvLoginPassword = null;
    target.tvLoginEmail = null;
  }
}
