/*
 * Copyright 2007 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.livetribe.slp.ua;

import org.livetribe.slp.settings.Settings;
import org.livetribe.slp.srv.ua.IUserAgent;

/**
 * Stateless SLP User Agent.
 *
 * @version $Revision$ $Date$
 */
public interface UserAgentClient extends IUserAgent
{
    public interface Factory
    {
        public UserAgentClient newUserAgentClient(Settings settings);
    }
}