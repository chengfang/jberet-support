/*
 * Copyright (c) 2015 Red Hat, Inc. and/or its affiliates.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Cheng Fang - Initial API and implementation
 */
 
package org.jberet.support.io;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Person2 extends Person {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "M/D/yyyy")
    Date birthday;

    @Override
    public Date getBirthday() {
        return birthday;
    }

    @Override
    public void setBirthday(final Date birthday) {
        this.birthday = birthday;
    }

}
