package org.mde.spec.ui.generator

import java.util.HashSet
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.GeneratorDelegate
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.mde.spec.ui.internal.SpecActivator

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
		// TODO: This is the default, we should really be inspecting the output configurations in the original fsa to know how it has been configured
		val srcGenFolder = project.getFolder("src-gen")

		val libFolder = project.getFolder("lib")
		//val libFile = libFolder.getFile('turtle_lib.jar')
		
		
		
//		if (!libFolder.exists) {
//			libFolder.create(false, true, null)
//			val libURL = SpecActivator.instance.find(new Path('lib/turtle_lib.jar'))
//			libFile.create(libURL.openStream, true, null)
//		}
//		
//		// Make a Java project, if it isn't one already
//		val projectDescription = project.description
//		if (!projectDescription.natureIds.contains(JavaCore.NATURE_ID)) {
//			projectDescription.natureIds = projectDescription.natureIds + #[JavaCore.NATURE_ID]
//			project.setDescription(projectDescription, null)			
//		}
//
//		val javaProject = JavaCore.create(project)
//
//		val existingClasspath = javaProject.rawClasspath
//
//		val classPathEntries = new HashSet<IClasspathEntry>()
//		classPathEntries.addAll(existingClasspath)
//		if (!existingClasspath.exists[(entryKind === IClasspathEntry.CPE_CONTAINER)]) {		
//			classPathEntries.add(JavaRuntime.getDefaultJREContainerEntry)
//		}
//		if (!existingClasspath.exists[(entryKind === IClasspathEntry.CPE_SOURCE) && (path == srcGenFolder.fullPath)]) {
//			classPathEntries.add(JavaCore.newSourceEntry(srcGenFolder.fullPath))		
//		}
//		if (!existingClasspath.exists[(entryKind === IClasspathEntry.CPE_LIBRARY) && (path == libFile.fullPath)]) {
//			classPathEntries.add(JavaCore.newLibraryEntry(libFile.fullPath, null, null))		
//		}
//
//		javaProject.setRawClasspath(classPathEntries, null)
	}
 }