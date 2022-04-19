// Generated code from Butter Knife. Do not modify!
package com.moringaschool.android_ip_1.UI;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.moringaschool.android_ip_1.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DetailsActivity_ViewBinding implements Unbinder {
  private DetailsActivity target;

  @UiThread
  public DetailsActivity_ViewBinding(DetailsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DetailsActivity_ViewBinding(DetailsActivity target, View source) {
    this.target = target;

    target.tvMovieName = Utils.findRequiredViewAsType(source, R.id.tvMovieName, "field 'tvMovieName'", TextView.class);
    target.tvMovieReleaseYear = Utils.findRequiredViewAsType(source, R.id.tvMovieReleaseYear, "field 'tvMovieReleaseYear'", TextView.class);
    target.tvMovieRating = Utils.findRequiredViewAsType(source, R.id.tvMovieRating, "field 'tvMovieRating'", TextView.class);
    target.tvMovieDescription = Utils.findRequiredViewAsType(source, R.id.tvMovieDescription, "field 'tvMovieDescription'", TextView.class);
    target.ivMoviePoster = Utils.findRequiredViewAsType(source, R.id.ivMoviePoster, "field 'ivMoviePoster'", ImageView.class);
    target.tvMovieLength = Utils.findRequiredViewAsType(source, R.id.tvMovieLength, "field 'tvMovieLength'", TextView.class);
    target.btnWatchTrailer = Utils.findRequiredViewAsType(source, R.id.btnWatchTrailer, "field 'btnWatchTrailer'", Button.class);
    target.btnCast = Utils.findRequiredViewAsType(source, R.id.btnCast, "field 'btnCast'", Button.class);
    target.btnAddToFavorites = Utils.findRequiredViewAsType(source, R.id.btnAddToFavorites, "field 'btnAddToFavorites'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvMovieName = null;
    target.tvMovieReleaseYear = null;
    target.tvMovieRating = null;
    target.tvMovieDescription = null;
    target.ivMoviePoster = null;
    target.tvMovieLength = null;
    target.btnWatchTrailer = null;
    target.btnCast = null;
    target.btnAddToFavorites = null;
  }
}
