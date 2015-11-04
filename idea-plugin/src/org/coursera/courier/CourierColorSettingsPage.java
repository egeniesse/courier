package org.coursera.courier;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class CourierColorSettingsPage implements ColorSettingsPage {
  private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
      new AttributesDescriptor("Comment", CourierSyntaxHighlighter.COMMENT),
      new AttributesDescriptor("Keyword", CourierSyntaxHighlighter.KEYWORD),
      new AttributesDescriptor("Documentation Strings", CourierSyntaxHighlighter.DOC_COMMENT),
      new AttributesDescriptor("Number", CourierSyntaxHighlighter.NUMBER),
      new AttributesDescriptor("String", CourierSyntaxHighlighter.STRING),
      new AttributesDescriptor("Field", CourierSyntaxHighlighter.FIELD),
      new AttributesDescriptor("Type Name", CourierSyntaxHighlighter.TYPE_NAME),
      new AttributesDescriptor("Builtin Type Names", CourierSyntaxHighlighter.BUILTIN_TYPE_NAME),
      new AttributesDescriptor("Type Reference", CourierSyntaxHighlighter.TYPE_REFERENCE),
      new AttributesDescriptor("Enumeration Symbols", CourierSyntaxHighlighter.ENUM_SYMBOL),
      new AttributesDescriptor("Properties", CourierSyntaxHighlighter.PROPERTY),
      new AttributesDescriptor("Colon", CourierSyntaxHighlighter.COLON),
      new AttributesDescriptor("Optional", CourierSyntaxHighlighter.OPTIONAL),
      new AttributesDescriptor("Braces", CourierSyntaxHighlighter.BRACES),
      new AttributesDescriptor("Brackets", CourierSyntaxHighlighter.BRACKETS),
      new AttributesDescriptor("Parentheses", CourierSyntaxHighlighter.PARENTHESES)
  };

  @Nullable
  @Override
  public Icon getIcon() {
    return CourierIcons.FILE;
  }

  @NotNull
  @Override
  public SyntaxHighlighter getHighlighter() {
    return new CourierSyntaxHighlighter();
  }

  @NotNull
  @Override
  public String getDemoText() {
    return "namespace org.example\n" +
        "\n" +
        "/** \n" +
        " * A Fortune.\n" +
        " */\n" +
        "@property1(\"property value\")\n" +
        "record Fortune {\n" +
        "  field1: int? = nil // comment 1\n" +
        "  field2: array[int] = [1, 2, 3]\n" +
        "  /* comment 2 */\n" +
        "  @deprecated\n" +
        "  field3: map[string, int] = { \"a\": 1, \"b\": 2 }\n" +
        "  inline: record Inline {\n" +
        "    inlineField1: union[Member1, Member2]\n" +
        "  }\n" +
        "}\n";
  }

  @Nullable
  @Override
  public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
    return null;
  }

  @NotNull
  @Override
  public AttributesDescriptor[] getAttributeDescriptors() {
    return DESCRIPTORS;
  }

  @NotNull
  @Override
  public ColorDescriptor[] getColorDescriptors() {
    return ColorDescriptor.EMPTY_ARRAY;
  }

  @NotNull
  @Override
  public String getDisplayName() {
    return "Courier";
  }
}
