/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.fibaro.internal.exception;

/**
 * Exception thrown when configuration is invalid.
 *
 * @author Johan Williams - Initial contribution
 */
public class FibaroConfigurationException extends FibaroException {

    private static final long serialVersionUID = 1231114236506945196L;

    public FibaroConfigurationException(String message) {
        super(message);
    }

    public FibaroConfigurationException(Throwable ex) {
        super(ex);
    }

    public FibaroConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

}
