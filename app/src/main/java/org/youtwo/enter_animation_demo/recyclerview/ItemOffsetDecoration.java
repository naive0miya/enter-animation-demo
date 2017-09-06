package org.youtwo.enter_animation_demo.recyclerview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Bill on 2017/9/6.
 */

public class ItemOffsetDecoration extends RecyclerView.ItemDecoration {
  private int mSpacing;

  public ItemOffsetDecoration(int itemOffset) {
    mSpacing = itemOffset;
  }

  @Override
  public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
      RecyclerView.State state) {
    super.getItemOffsets(outRect, view, parent, state);
    outRect.set(mSpacing, mSpacing, mSpacing, mSpacing);
  }
}
