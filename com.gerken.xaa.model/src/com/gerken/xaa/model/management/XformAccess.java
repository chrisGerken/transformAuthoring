package com.gerken.xaa.model.management;

import java.util.Hashtable;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import com.gerken.xaa.model.xform.Xform;

public class XformAccess implements IResourceChangeListener {

	private static Hashtable<String,Xform> models = new Hashtable<String, Xform>();
	
	public XformAccess() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceDelta.OPEN | IResourceDelta.REMOVED);
	}
	
	public Xform readModel(IProject project) {
		Xform result = (Xform) models.get(project.getName());
		if (result == null) {
			result = Xform.loadFrom(project);
			models.put(project.getName(),result);	
		}
		return result;
	}
	
	public void writeModel(IProject project, Xform model) { 
		model.persistTo(project);
	}

	public void resourceChanged(IResourceChangeEvent event) {
		IResourceDeltaVisitor visitor = new IResourceDeltaVisitor() {
        	public boolean visit(IResourceDelta delta) {
        		IResource affected = delta.getResource();
            	if (affected.getType() != IResource.PROJECT) {
            		return true;
            	}
            	if ((delta.getKind() == IResourceDelta.OPEN)|(delta.getKind() == IResourceDelta.REMOVED)) {
            		IProject project = (IProject) affected;
            		models.remove(project.getName());
            	}
               return true;
            }
         };

         try {
			event.getDelta().accept(visitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

}
