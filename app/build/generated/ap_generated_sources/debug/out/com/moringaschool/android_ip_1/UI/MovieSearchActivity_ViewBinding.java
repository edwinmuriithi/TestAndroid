// Generated code from Butter Knife. Do not modify!
package com.moringaschool.android_ip_1.UI;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.moringaschool.android_ip_1.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MovieSearchActivity_ViewBinding implements Unbinder {
  private MovieSearchActivity target;

  @UiThread
  public MovieSearchActivity_ViewBinding(MovieSearchActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MovieSearchActivity_ViewBinding(MovieSearchActivity target, View source) {
    this.target = target;

    target.tvProfileGreeting = Utils.findRequiredViewAsType(source, R.id.tvProfileGreeting, "field 'tvProfileGreeting'", TextView.class);
    target.svSearchView = Utils.findRequiredViewAsType(source, R.id.svSearchView, "field 'svSearchView'", SearchView.class);
    target.rvRecyclerView = Utils.findRequiredViewAsType(source, R.id.rvRecyclerView, "field 'rvRecyclerView'", RecyclerView.class);
    target.cvResultsDisplay = Utils.findRequiredViewAsType(source, R.id.cvResultsDisplay, "field 'cvResultsDisplay'", CardView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MovieSearchActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvProfileGreeting = null;
    target.svSearchView = null;
    target.rvRecyclerView = null;
    target.cvResultsDisplay = null;
  }
}
