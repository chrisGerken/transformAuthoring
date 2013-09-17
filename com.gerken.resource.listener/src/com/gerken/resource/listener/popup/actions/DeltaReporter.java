package com.gerken.resource.listener.popup.actions;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class DeltaReporter implements IResourceDeltaVisitor {

	private ArrayList<IStatus> stati;
	
	public DeltaReporter(ArrayList<IStatus> stati) {
		this.stati = stati;
	}

	@Override
	public boolean visit(IResourceDelta delta)  {
		try {
			IResource res = delta.getResource();
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				log("Resource "+res.getFullPath()+" was added.");
				break;
			case IResourceDelta.REMOVED:
				log("Resource "+res.getFullPath()+" was removed.");
				break;
			case IResourceDelta.CHANGED:
				if (delta.getResource() instanceof IFile) {
					log("Resource "+res.getFullPath()+" was changed.");
				break;
				}
			}
			return true; // visit the children
		} catch (Exception e) {
			log("CoreException");
			return false;
		}
	}

	private void log(String msg) {
		stati.add(new Status(IStatus.INFO,"com.gerken.resource.listener",msg));
	}

}
