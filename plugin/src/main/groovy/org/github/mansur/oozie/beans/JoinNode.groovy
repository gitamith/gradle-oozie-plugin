package org.github.mansur.oozie.beans

import groovy.xml.MarkupBuilder;

import java.util.HashMap;
import java.util.Map;

class JoinNode extends WorkflowNode {
  private static final long serialVersionUID = 1L

  String to

  void buildXml(MarkupBuilder xml, CommonProperties common) {
    xml.join(name: name, to: to)
  }
}
