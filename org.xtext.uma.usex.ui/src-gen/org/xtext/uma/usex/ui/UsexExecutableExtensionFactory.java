/*
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.uma.usex.ui.internal.UsexActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class UsexExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(UsexActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		UsexActivator activator = UsexActivator.getInstance();
		return activator != null ? activator.getInjector(UsexActivator.ORG_XTEXT_UMA_USEX_USEX) : null;
	}

}
