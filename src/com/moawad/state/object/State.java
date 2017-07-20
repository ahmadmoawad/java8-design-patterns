/*
 * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 */
package com.moawad.state.object;

/**
 *
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public interface State {

    public String getApplication();

    public String checkApplication();

    public String rentApartment();

    public String dispenseKeys();

}
