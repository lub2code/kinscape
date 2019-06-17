
// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/android/webapk/webapk_install_service.h

package org.chromium.chrome.browser.webapps;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    WebApkInstallResult.SUCCESS, WebApkInstallResult.FAILURE, WebApkInstallResult.PROBABLE_FAILURE
})
@Retention(RetentionPolicy.SOURCE)
public @interface WebApkInstallResult {
  int SUCCESS = 0;
  int FAILURE = 1;
  /**
   * An install was initiated but it timed out. We did not get a response from the install service
   * so it is possible that the install will complete some time in the future.
   */
  int PROBABLE_FAILURE = 2;
}
