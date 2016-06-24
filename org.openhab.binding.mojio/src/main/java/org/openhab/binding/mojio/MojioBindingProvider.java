/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.mojio;

import org.openhab.core.binding.BindingProvider;

import org.openhab.binding.mojio.messages.GetVehicleData;
import org.openhab.binding.mojio.messages.VehicleStatusResponse;
import org.openhab.binding.mojio.messages.VehicleType;
import org.openhab.binding.mojio.messages.GetMojioData;
import org.openhab.binding.mojio.messages.MojioStatusResponse;
import org.openhab.binding.mojio.messages.MojioType;

/**
 * @author Vladimir Pavluk
 * @since 1.0
 */
public interface MojioBindingProvider extends BindingProvider {

  String getMojioIMEI(String itemName);

  String[] getValuePath(String itemName);

  double getItemRate(String itemName);

  Class getItemType(String itemName);
}