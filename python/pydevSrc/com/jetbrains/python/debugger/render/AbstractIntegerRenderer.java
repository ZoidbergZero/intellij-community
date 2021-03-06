// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.jetbrains.python.debugger.render;

import com.google.common.collect.ImmutableSet;

public abstract class AbstractIntegerRenderer implements PyNodeRenderer {

  private static final ImmutableSet<String> mySupportedTypes = ImmutableSet.of("int");

  @Override
  public boolean isApplicable(String type) {
    return type != null && mySupportedTypes.contains(type);
  }
}
