package org.youtwo.enter_animation_demo.fragment;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import org.youtwo.enter_animation_demo.R;
import org.youtwo.enter_animation_demo.model.AnimationItem;

/**
 * Created by Bill on 2017/9/6.
 */

public class GridDemoFragment extends BaseFragment {
  @Override
  protected int getLayoutResId() {
    return R.layout.frag_grid;
  }

  @Override
  protected RecyclerView.LayoutManager getLayoutManager(Context context) {
    return new GridLayoutManager(context, 4);
  }

  @Override
  protected AnimationItem[] getAnimationItems() {
    return new AnimationItem[] {
        new AnimationItem("Slide from bottom", R.anim.grid_layout_animation_from_bottom),
        new AnimationItem("Scale", R.anim.grid_layout_animation_scale),
        new AnimationItem("Scale random", R.anim.grid_layout_animation_scale_random)
    };
  }
}
