package org.mde.spec.ui.generator

import org.eclipse.core.resources.IProject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.GeneratorDelegate
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class SpecGeneratorDelegate extends GeneratorDelegate {
	override void generate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		super.generate(input, fsa, context)
		
		if (fsa instanceof EclipseResourceFileSystemAccess3) {
			val project = fsa.project
			
			project.initialise
		}
	}
	
	/**
	 * Initialise the project if that hasn't happened yet.
	 */
	private def initialise(IProject project) {
		
	}
 }