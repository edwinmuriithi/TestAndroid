// Generated by view binder compiler. Do not edit!
package com.moringaschool.android_ip_1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.moringaschool.android_ip_1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignUpBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout clSignUpCreateAccount;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextInputEditText tvSignUpConfirmPassword;

  @NonNull
  public final TextView tvSignUpCreateAccount;

  @NonNull
  public final TextInputEditText tvSignUpEmail;

  @NonNull
  public final TextInputEditText tvSignUpName;

  @NonNull
  public final TextInputEditText tvSignUpPassword;

  @NonNull
  public final TextView tvSignUpSignIn;

  @NonNull
  public final TextView tvSignUpTitle;

  private ActivitySignUpBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout clSignUpCreateAccount, @NonNull TextView textView8,
      @NonNull TextInputEditText tvSignUpConfirmPassword, @NonNull TextView tvSignUpCreateAccount,
      @NonNull TextInputEditText tvSignUpEmail, @NonNull TextInputEditText tvSignUpName,
      @NonNull TextInputEditText tvSignUpPassword, @NonNull TextView tvSignUpSignIn,
      @NonNull TextView tvSignUpTitle) {
    this.rootView = rootView;
    this.clSignUpCreateAccount = clSignUpCreateAccount;
    this.textView8 = textView8;
    this.tvSignUpConfirmPassword = tvSignUpConfirmPassword;
    this.tvSignUpCreateAccount = tvSignUpCreateAccount;
    this.tvSignUpEmail = tvSignUpEmail;
    this.tvSignUpName = tvSignUpName;
    this.tvSignUpPassword = tvSignUpPassword;
    this.tvSignUpSignIn = tvSignUpSignIn;
    this.tvSignUpTitle = tvSignUpTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.clSignUpCreateAccount;
      ConstraintLayout clSignUpCreateAccount = ViewBindings.findChildViewById(rootView, id);
      if (clSignUpCreateAccount == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.tvSignUpConfirmPassword;
      TextInputEditText tvSignUpConfirmPassword = ViewBindings.findChildViewById(rootView, id);
      if (tvSignUpConfirmPassword == null) {
        break missingId;
      }

      id = R.id.tvSignUpCreateAccount;
      TextView tvSignUpCreateAccount = ViewBindings.findChildViewById(rootView, id);
      if (tvSignUpCreateAccount == null) {
        break missingId;
      }

      id = R.id.tvSignUpEmail;
      TextInputEditText tvSignUpEmail = ViewBindings.findChildViewById(rootView, id);
      if (tvSignUpEmail == null) {
        break missingId;
      }

      id = R.id.tvSignUpName;
      TextInputEditText tvSignUpName = ViewBindings.findChildViewById(rootView, id);
      if (tvSignUpName == null) {
        break missingId;
      }

      id = R.id.tvSignUpPassword;
      TextInputEditText tvSignUpPassword = ViewBindings.findChildViewById(rootView, id);
      if (tvSignUpPassword == null) {
        break missingId;
      }

      id = R.id.tvSignUpSignIn;
      TextView tvSignUpSignIn = ViewBindings.findChildViewById(rootView, id);
      if (tvSignUpSignIn == null) {
        break missingId;
      }

      id = R.id.tvSignUpTitle;
      TextView tvSignUpTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvSignUpTitle == null) {
        break missingId;
      }

      return new ActivitySignUpBinding((ConstraintLayout) rootView, clSignUpCreateAccount,
          textView8, tvSignUpConfirmPassword, tvSignUpCreateAccount, tvSignUpEmail, tvSignUpName,
          tvSignUpPassword, tvSignUpSignIn, tvSignUpTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}