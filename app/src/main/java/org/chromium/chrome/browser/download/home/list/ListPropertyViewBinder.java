// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.download.home.list;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemAnimator;

import com.us.kinscape.R;
import org.chromium.ui.modelutil.PropertyKey;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.modelutil.PropertyModelChangeProcessor.ViewBinder;

class ListPropertyViewBinder implements ViewBinder<PropertyModel, RecyclerView, PropertyKey> {
    @Override
    public void bind(PropertyModel model, RecyclerView view, PropertyKey propertyKey) {
        if (propertyKey == ListProperties.ENABLE_ITEM_ANIMATIONS) {
            if (model.get(ListProperties.ENABLE_ITEM_ANIMATIONS)) {
                if (view.getItemAnimator() == null) {
                    view.setItemAnimator((ItemAnimator) view.getTag(R.id.item_animator));
                    view.setTag(R.id.item_animator, null);
                }
            } else {
                if (view.getItemAnimator() != null) {
                    view.setTag(R.id.item_animator, view.getItemAnimator());
                    view.setItemAnimator(null);
                }
            }
        } else if (propertyKey == ListProperties.CALLBACK_OPEN
                || propertyKey == ListProperties.CALLBACK_PAUSE
                || propertyKey == ListProperties.CALLBACK_RESUME
                || propertyKey == ListProperties.CALLBACK_CANCEL
                || propertyKey == ListProperties.CALLBACK_SHARE
                || propertyKey == ListProperties.CALLBACK_REMOVE
                || propertyKey == ListProperties.PROVIDER_VISUALS
                || propertyKey == ListProperties.CALLBACK_SELECTION
                || propertyKey == ListProperties.SELECTION_MODE_ACTIVE) {
            view.getAdapter().notifyItemRangeChanged(0, view.getAdapter().getItemCount());
        }
    }
}