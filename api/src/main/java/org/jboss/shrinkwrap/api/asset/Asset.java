/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.api.asset;

import java.io.InputStream;

import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ArchivePath;
import org.jboss.shrinkwrap.api.Node;

/**
 * Represents byte-based content.
 * Typically stored within a {@link Node} inside of an {@link Archive}
 * under a context {@link ArchivePath}.  May be added
 * directly to all {@link Archive} types. 
 * 
 * @author <a href="mailto:aslak@conduct.no">Aslak Knutsen</a>
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
public interface Asset
{
   /**
    * Get a input stream for the resource content.
    * The caller is responsible for closing the stream. 
    * If this returns null, this denotes that the {@link Asset}
    * is to be viewed as a logical path (placeholder/directory) 
    * only with no backing content.
    * 
    * @return A new open {@link InputStream} for each call, or null if this
    * type simply represents a logical path within an {@link Archive}
    */
   InputStream openStream();
}
