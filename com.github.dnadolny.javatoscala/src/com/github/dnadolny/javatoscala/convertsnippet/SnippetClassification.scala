package com.github.dnadolny.javatoscala.convertsnippet

sealed trait SnippetClassification
case object TopLevel extends SnippetClassification
case object ContentsOfClass extends SnippetClassification
case object ContentsOfMethod extends SnippetClassification