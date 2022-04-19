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

public class SignUpActivity_ViewBinding implements Unbinder {
  private SignUpActivity target;

  @UiThread
  public SignUpActivity_ViewBinding(SignUpActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SignUpActivity_ViewBinding(SignUpActivity target, View source) {
    this.target = target;

    target.tvSignUpName = Utils.findRequiredViewAsType(source, R.id.tvSignUpName, "field 'tvSignUpName'", TextView.class);
    target.tvSignUpEmail = Utils.findRequiredViewAsType(source, R.id.tvSignUpEmail, "field 'tvSignUpEmail'", TextView.class);
    target.tvSignUpPassword = Utils.findRequiredViewAsType(source, R.id.tvSignUpPassword, "field 'tvSignUpPassword'", TextView.class);
    target.tvSignUpConfirmPassword = Utils.findRequiredViewAsType(source, R.id.tvSignUpConfirmPassword, "field 'tvSignUpConfirmPassword'", TextView.class);
    target.clSignUpCreateAccount = Utils.findRequiredViewAsType(source, R.id.clSignUpCreateAccount, "field 'clSignUpCreateAccount'", ConstraintLayout.class);
    target.tvSignUpSignIn = Utils.findRequiredViewAsType(source, R.id.tvSignUpSignIn, "field 'tvSignUpSignIn'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SignUpActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvSignUpName = null;
    target.tvSignUpEmail = null;
    target.tvSignUpPassword = null;
    target.tvSignUpConfirmPassword = null;
    target.clSignUpCreateAccount = null;
    target.tvSignUpSignIn = null;
  }
}
