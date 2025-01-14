// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.sdk.language.psi.HublTypes.*;
import org.intellij.sdk.language.psi.*;
import com.intellij.navigation.ItemPresentation;

public class HublPropertyImpl extends HublNamedElementImpl implements HublProperty {

  public HublPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HublVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HublVisitor) accept((HublVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  public String getKey() {
    return HublPsiImplUtil.getKey(this);
  }

  @Override
  public String getValue() {
    return HublPsiImplUtil.getValue(this);
  }

  @Override
  public String getName() {
    return HublPsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return HublPsiImplUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return HublPsiImplUtil.getNameIdentifier(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return HublPsiImplUtil.getPresentation(this);
  }

}
