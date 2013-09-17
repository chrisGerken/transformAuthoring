package com.gerken.resource.listener.popup.actions;

import java.util.ArrayList;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;

import com.gerken.resource.listener.Activator;

public class ResourceChangeReporter implements IResourceChangeListener {

	private ArrayList<IStatus> stati;

	public ResourceChangeReporter() {
		clearStati();
	}

	public void resourceChanged(IResourceChangeEvent event) {

		try {
			IResource res = event.getResource();
			switch (event.getType()) {
			case IResourceChangeEvent.PRE_CLOSE:
				log("Project " + res.getFullPath() + " is about to close.");
				break;
			case IResourceChangeEvent.PRE_DELETE:
				log("Project " + res.getFullPath() + " is about to be deleted.");
				break;
			case IResourceChangeEvent.POST_CHANGE:
				event.getDelta().accept(new DeltaReporter(stati));
				break;
			case IResourceChangeEvent.PRE_BUILD:
				event.getDelta().accept(new DeltaReporter(stati));
				break;
			case IResourceChangeEvent.POST_BUILD:
				event.getDelta().accept(new DeltaReporter(stati));
				break;
			}
		} catch (CoreException e) {
			log("CoreException");
		}

	}

	public void clearStati() {
		stati = new ArrayList<IStatus>();
	}

	public void beginRecording() {
		clearStati();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(
				this,
				IResourceChangeEvent.PRE_CLOSE
						| IResourceChangeEvent.PRE_DELETE
						| IResourceChangeEvent.PRE_BUILD
						| IResourceChangeEvent.POST_BUILD
						| IResourceChangeEvent.POST_CHANGE);
	}

	public void stopRecording() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		reportStati();
		clearStati();
	}
	
	public void reportStati() {
		IStatus status[] = new IStatus[stati.size()];
		stati.toArray(status);
		Activator.getDefault().getLog().log(
				new MultiStatus("com.gerken.resource.listener", IStatus.WARNING,
						status, "Resource Change Recording complete", null));
	}

	private void log(String msg) {
		stati.add(new Status(IStatus.INFO, "com.gerken.resource.listener",
						msg));
	}

}
