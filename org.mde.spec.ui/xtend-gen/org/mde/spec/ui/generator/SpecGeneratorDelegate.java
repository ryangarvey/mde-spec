package org.mde.spec.ui.generator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.mde.spec.ui.generator.EclipseResourceFileSystemAccess3;

@SuppressWarnings("all")
public class SpecGeneratorDelegate extends GeneratorDelegate {
  @Override
  public void generate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    super.generate(input, fsa, context);
    if ((fsa instanceof EclipseResourceFileSystemAccess3)) {
      final IProject project = ((EclipseResourceFileSystemAccess3)fsa).getProject();
      this.initialise(project);
    }
  }
  
  /**
   * Initialise the project if that hasn't happened yet.
   */
  private void initialise(final IProject project) {
    final IFolder srcGenFolder = project.getFolder("src-gen");
    final IFolder libFolder = project.getFolder("lib");
  }
}
