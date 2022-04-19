// Generated code from Butter Knife. Do not modify!
package com.moringaschool.android_ip_1.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.moringaschool.android_ip_1.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeViewHolder_ViewBinding implements Unbinder {
  private HomeViewHolder target;

  @UiThread
  public HomeViewHolder_ViewBinding(HomeViewHolder target, View source) {
    this.target = target;

    target.ivPoster = Utils.findRequiredViewAsType(source, R.id.ivPoster, "field 'ivPoster'", ImageView.class);
    target.tvViewMovie = Utils.findRequiredViewAsType(source, R.id.tvViewMovie, "field 'tvViewMovie'", TextView.class);
    target.cvHomeContainer = Utils.findRequiredViewAsType(source, R.id.cvHomeContainer, "field 'cvHomeContainer'", CardView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivPoster = null;
    target.tvViewMovie = null;
    target.cvHomeContainer = null;
  }
}
