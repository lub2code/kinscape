
// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/omnibox/browser/suggestion_answer.h

package org.chromium.components.omnibox;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    AnswerTextType.TOP_ALIGNED, AnswerTextType.DESCRIPTION_NEGATIVE,
    AnswerTextType.DESCRIPTION_POSITIVE, AnswerTextType.SUGGESTION,
    AnswerTextType.PERSONALIZED_SUGGESTION, AnswerTextType.ANSWER_TEXT_MEDIUM,
    AnswerTextType.ANSWER_TEXT_LARGE, AnswerTextType.SUGGESTION_SECONDARY_TEXT_SMALL,
    AnswerTextType.SUGGESTION_SECONDARY_TEXT_MEDIUM
})
@Retention(RetentionPolicy.SOURCE)
public @interface AnswerTextType {
  /**
   * Deprecated: ANSWER = 1, Deprecated: HEADLINE = 2,
   */
  int TOP_ALIGNED = 3;
  /**
   * Deprecated: DESCRIPTION = 4,
   */
  int DESCRIPTION_NEGATIVE = 5;
  int DESCRIPTION_POSITIVE = 6;
  /**
   * Deprecated: MORE_INFO = 7,
   */
  int SUGGESTION = 8;
  /**
   * Deprecated: SUGGESTION_POSITIVE = 9, Deprecated: SUGGESTION_NEGATIVE = 10, Deprecated:
   * SUGGESTION_LINK = 11, Deprecated: STATUS = 12,
   */
  int PERSONALIZED_SUGGESTION = 13;
  /**
   * Deprecated: IMMERSIVE_DESCRIPTION_TEXT = 14, Deprecated: DATE_TEXT = 15, Deprecated:
   * PREVIEW_TEXT = 16,
   */
  int ANSWER_TEXT_MEDIUM = 17;
  int ANSWER_TEXT_LARGE = 18;
  int SUGGESTION_SECONDARY_TEXT_SMALL = 19;
  int SUGGESTION_SECONDARY_TEXT_MEDIUM = 20;
}
