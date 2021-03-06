/*
 * This is part of Geomajas, a GIS framework, http://www.geomajas.org/.
 *
 * Copyright 2008-2013 Geosparc nv, http://www.geosparc.com/, Belgium.
 *
 * The program is available in open source according to the GNU Affero
 * General Public License. All contributions in this program are covered
 * by the Geomajas Contributors License Agreement. For full licensing
 * details, see LICENSE.txt in the project root.
 */

package org.geomajas.gwt.client.command.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import org.geomajas.annotation.Api;
import org.geomajas.annotation.UserImplemented;

/**
 * Interface for event handlers that catch {@link org.geomajas.gwt.client.command.event.DispatchStartedEvent}s.
 *
 * @author Jan De Moerloose
 * @since 0.0.0
 */
@Api(allMethods = true)
@UserImplemented
public interface DispatchStartedHandler extends EventHandler {

	/**
	 * Type for the events.
	 *
	 * @since 1.0.0
	 */
	GwtEvent.Type<DispatchStartedHandler> TYPE = new GwtEvent.Type<DispatchStartedHandler>();

	/**
	 * The event catching method.
	 *
	 * @param event
	 *            The actual {@link org.geomajas.gwt.client.command.event.DispatchStartedEvent}.
	 */
	void onDispatchStarted(DispatchStartedEvent event);
}
