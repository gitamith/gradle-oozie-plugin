package org.github.mansur.oozie.beans

import java.util.Map;

abstract class CapturingHadoopActionNode extends HadoopActionNode {
  private static final long serialVersionUID = 1L

  Boolean captureOutput

  @Override
  protected Map<String, String> rawMap() {
    return super.rawMap() + (captureOutput == null ? [:] : [captureOutput: captureOutput])
  }
}