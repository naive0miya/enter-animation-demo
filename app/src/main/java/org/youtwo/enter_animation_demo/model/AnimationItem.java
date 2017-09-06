package org.youtwo.enter_animation_demo.model;

/**
 * Created by Bill on 2017/9/6.
 */

public class AnimationItem {
  private final String mName;
  private final int mResourceId;

  public AnimationItem(String name, int resourceId) {
    mName = name;
    mResourceId = resourceId;
  }

  public String getName() {
    return mName;
  }

  public int getResourceId() {
    return mResourceId;
  }
}
