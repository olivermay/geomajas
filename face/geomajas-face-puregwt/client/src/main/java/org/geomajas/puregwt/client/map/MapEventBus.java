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
package org.geomajas.puregwt.client.map;

import org.geomajas.annotation.Api;
import org.geomajas.puregwt.client.event.FeatureSelectionHandler;
import org.geomajas.puregwt.client.event.LayerLabeledHandler;
import org.geomajas.puregwt.client.event.LayerOrderChangedHandler;
import org.geomajas.puregwt.client.event.LayerRefreshedHandler;
import org.geomajas.puregwt.client.event.LayerSelectionHandler;
import org.geomajas.puregwt.client.event.LayerStyleChangedHandler;
import org.geomajas.puregwt.client.event.LayerVisibilityHandler;
import org.geomajas.puregwt.client.event.MapCompositionHandler;
import org.geomajas.puregwt.client.event.MapInitializationHandler;
import org.geomajas.puregwt.client.event.MapResizedHandler;
import org.geomajas.puregwt.client.event.ViewPortChangedHandler;
import org.geomajas.puregwt.client.event.ViewPortChangingHandler;
import org.geomajas.puregwt.client.map.layer.Layer;

import com.google.web.bindery.event.shared.Event;
import com.google.web.bindery.event.shared.Event.Type;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * Event bus with convenience methods for registering handlers to a specific map.
 * 
 * @author Jan De Moerloose
 * @since 1.0.0
 */
@Api(allMethods = true)
public interface MapEventBus {

	/**
	 * Add a feature selection handler.
	 * 
	 * @param handler the handler
	 * @return the handler registration
	 */
	HandlerRegistration addFeatureSelectionHandler(FeatureSelectionHandler handler);

	/**
	 * Add a feature selection handler for a specific layer.
	 * 
	 * @param handler the handler
	 * @param layer the layer
	 * @return the handler registration
	 */
	HandlerRegistration addFeatureSelectionHandler(FeatureSelectionHandler handler, Layer layer);

	/**
	 * Add a layer labeling handler.
	 * 
	 * @param handler the handler
	 * @return the handler registration
	 */
	HandlerRegistration addLayerLabeledHandler(LayerLabeledHandler handler);

	/**
	 * Add a layer labeling handler for a specific layer.
	 * 
	 * @param handler the handler
	 * @param layer the layer
	 * @return the handler registration
	 */
	HandlerRegistration addLayerLabeledHandler(LayerLabeledHandler handler, Layer layer);

	/**
	 * Add a layer order handler.
	 * 
	 * @param handler the handler
	 * @return the handler registration
	 */
	HandlerRegistration addLayerOrderChangedHandler(LayerOrderChangedHandler handler);

	/**
	 * Add a layer refresh handler.
	 * 
	 * @param handler the handler
	 * @return the handler registration
	 */
	HandlerRegistration addLayerRefreshedHandler(LayerRefreshedHandler handler);

	/**
	 * Add a layer refresh handler for a specific layer.
	 * 
	 * @param handler the handler
	 * @param layer the layer
	 * @return the handler registration
	 */
	HandlerRegistration addLayerRefreshedHandler(LayerRefreshedHandler handler, Layer layer);

	/**
	 * Add a layer selection handler.
	 * 
	 * @param handler the handler
	 * @return the handler registration
	 */
	HandlerRegistration addLayerSelectionHandler(LayerSelectionHandler handler);

	/**
	 * Add a layer selection handler for a specific layer.
	 * 
	 * @param handler the handler
	 * @param layer the layer
	 * @return the handler registration
	 */
	HandlerRegistration addLayerSelectionHandler(LayerSelectionHandler handler, Layer layer);

	/**
	 * Add a layer style change handler.
	 * 
	 * @param handler the handler
	 * @return the handler registration
	 */
	HandlerRegistration addLayerStyleChangedHandler(LayerStyleChangedHandler handler);

	/**
	 * Add a layer style change handler for a specific layer.
	 * 
	 * @param handler the handler
	 * @param layer the layer
	 * @return the handler registration
	 */
	HandlerRegistration addLayerStyleChangedHandler(LayerStyleChangedHandler handler, Layer layer);

	/**
	 * Add a layer visibility handler.
	 * 
	 * @param handler the handler
	 * @return the handler registration
	 */
	HandlerRegistration addLayerVisibilityHandler(LayerVisibilityHandler handler);

	/**
	 * Add a layer visibility handler for a specific layer.
	 * 
	 * @param handler the handler
	 * @param layer the layer
	 * @return the handler registration
	 */
	HandlerRegistration addLayerVisibilityHandler(LayerVisibilityHandler handler, Layer layer);

	/**
	 * Add a map composition selection handler.
	 * 
	 * @param handler the handler
	 * @return the handler registration
	 */
	HandlerRegistration addMapCompositionHandler(MapCompositionHandler handler);

	/**
	 * Add a map initialization handler.
	 * 
	 * @param handler the handler
	 * @return the handler registration
	 */
	HandlerRegistration addMapInitializationHandler(MapInitializationHandler handler);

	/**
	 * Add a map resize handler.
	 * 
	 * @param handler the handler
	 * @return the handler registration
	 */
	HandlerRegistration addMapResizedHandler(MapResizedHandler handler);

	/**
	 * Add a viewport handler.
	 * 
	 * @param handler the handler
	 * @return the handler registration
	 */
	HandlerRegistration addViewPortChangedHandler(ViewPortChangedHandler handler);
	
	/**
	 * Add a viewport handler.
	 * 
	 * @param handler the handler
	 * @return the handler registration
	 */
	HandlerRegistration addViewPortChangingHandler(ViewPortChangingHandler handler);
	
	/**
	 * Add a handler of this type to the map.
	 *
	 * @param type type of handler
	 * @param handler handler
	 * @return the handler registration
	 */
	<H> HandlerRegistration addHandler(Type<H> type, H handler);

	/**
	 * Fire an event from this map.
	 * 
	 * @param event the event
	 */
	<H> void fireEvent(Event<H> event);
	
}